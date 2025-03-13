package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import game.videojuego.CompararTitulo;
import game.videojuego.Videojuego;

public class TiendaVideojuegos {

	private List<Videojuego> inventario;
	private static Videojuego juegoMasBarato;
	private static Videojuego juegoMasCaro;
	
	public TiendaVideojuegos() {
		inventario = new ArrayList<Videojuego>();
	}
	
	public void addVideojuego(Videojuego v) {
		inventario.add(v);
		if(v.getPrecio() > juegoMasCaro.getPrecio()) {
			juegoMasCaro = v;
		}
		if(v.getPrecio() < juegoMasBarato.getPrecio()) {
			juegoMasBarato = v;
		}
	}
	
	public void juegoMasCaroYMasBarato() {
		System.out.println("El juego más barato es: " + juegoMasBarato.getTitulo());
		System.out.println("El juego más caro es; " + juegoMasCaro.getTitulo());
	}
	
	public void juegosDisponibles() {
		Collections.sort(inventario, new CompararTitulo());
		System.out.println("Titulos de la tienda disponibles:");
		for(Videojuego v : inventario) {
			System.out.println(v.getTitulo());
		}
	}
	
	public void buscarJuegoGeneroYPlataforma(String genero, String plataforma) {
		for(Videojuego v : inventario) {
			if(v.getGenero().equals(genero) & v.getPlataforma().equals(plataforma)) {
				System.out.println(v.getTitulo());
			}
		}
	}
	
	public void venderVideojuego(Videojuego v, Cliente c) {
		if(inventario.contains(v)) {
			inventario.remove(v);
		}else {
			System.out.println("El videojuego no se encuentra en el inventario.");
		}
		c.comprarVideojuego(v);
	}
	
	
	
	
	
}
