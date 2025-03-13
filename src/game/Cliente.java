package game;

import java.util.ArrayList;
import java.util.List;

import game.videojuego.Videojuego;

public class Cliente implements Comparable<Cliente>{

	private String nombre;
	private String direccion;
	private List<Videojuego> videojuegos;
	
	public Cliente(String nombre, String direccion) {
		setNombre(nombre);
		setDireccion(direccion);
		this.videojuegos = new ArrayList<Videojuego>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public List<Videojuego> getVideojuegos(){
		return this.videojuegos;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void comprarVideojuego(Videojuego v) {
		videojuegos.add(v);
	}
	
	@Override
	public int compareTo(Cliente c) {
		return this.nombre.compareTo(c.nombre);
	}
	
}
