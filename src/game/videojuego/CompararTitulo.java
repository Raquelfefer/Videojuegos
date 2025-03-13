package game.videojuego;

import java.util.Comparator;

public class CompararTitulo implements Comparator<Videojuego>{

	@Override
	public int compare(Videojuego v1, Videojuego v2) {
		return v1.getTitulo().compareTo(v2.getTitulo());
	}
}
