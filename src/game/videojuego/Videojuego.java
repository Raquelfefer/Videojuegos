package game.videojuego;

public abstract class Videojuego implements Comparable<Videojuego>{

	private String titulo;
	private String genero;
	private String plataforma;
	private double precio;
	
	public Videojuego(String titulo, String genero, String plataforma, double precio) {
		setTitulo(titulo);
		setGenero(genero);
		setPlataforma(plataforma);
		setPrecio(precio);
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public String getPlataforma() {
		return this.plataforma;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(this.getClass() != (o.getClass())) {
			return false;
		}
		boolean iguales = false;
		Videojuego otro = (Videojuego) o;
		if(this.titulo.equals(otro.titulo) & this.genero.equals(otro.genero) & this.plataforma.equals(otro.plataforma) & this.precio == otro.precio) {
			iguales = true;
		}
		return iguales;
	}
	
	
	@Override
	public int compareTo(Videojuego v) {
		return this.genero.compareTo(v.genero);
	}
}
