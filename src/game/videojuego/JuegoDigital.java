package game.videojuego;

public class JuegoDigital extends Videojuego implements Entregable{

	private double tamanio;
	
	public JuegoDigital(String titulo, String genero, String plataforma, double precio, double tamanio) {
		super(titulo, genero, plataforma, precio);
		setTamanio(tamanio);
	}
	
	public double getTamanio() {
		return this.tamanio;
	}
	
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	
	@Override
	public void entregar() {
		
	}
	
}
