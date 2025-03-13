package game.videojuego;

public class JuegoFisico extends Videojuego implements Entregable{

	private Estado estado;
	private Disponibilidad disponibilidad;
	
	public JuegoFisico(String titulo, String genero, String plataforma, double precio, String estado, String disponibilidad) {
		super(titulo, genero, plataforma, precio);
		setEstado(estado);
		setDisponibilidad(disponibilidad);
	}
	
	public String getEstado() {
		return this.estado.toString();
	}
	
	public String getDisponibilidad() {
		return this.disponibilidad.toString();
	}
	
	public void setEstado(String estado) {
		this.estado = Estado.valueOf(estado);
	}
	
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = Disponibilidad.valueOf(disponibilidad);
	}
	
	@Override
	public void entregar() {
		
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(this.getClass() != o.getClass()) {
			return false;
		}
		boolean iguales = false;
		JuegoFisico otro = (JuegoFisico) o;
		if(super.equals(otro) & this.disponibilidad.equals(otro.disponibilidad) & this.estado.equals(otro.estado)){
			iguales = true;
		}
		return iguales;
	}
	
	@Override
	public String toString() {
		return "Juego Físico [Titulo = " + this.getTitulo() + ", genero = " + this.getGenero() + ", plataforma = " + this.getPlataforma() 
		+ ", precio = " + this.getPrecio() + ", estado = " + this.estado + ", disponibilidad = " + this.disponibilidad + " ] \n";
	}
	
}
