package game.videojuego;

import java.util.Comparator;

public class ComparadorPrecio implements Comparator<Videojuego>{

	@Override
	public int compare(Videojuego v1, Videojuego v2) {
		return (int) (v1.getPrecio() - v2.getPrecio());
	}
	
//	 @Override
//	    public int compare(Videojuego v1, Videojuego v2) {
//	        return Double.compare(v1.getPrecio(), v2.getPrecio());
//	    }
}
