package oo2.ejercicio12_Decodificador;

import java.util.List;

public class Similaridad extends Criterio {
	
	public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		// Le digo al contexto, reprodujiste alguna similar a ésta?
		// O le digo a la película, sos similar a alguna de éstas?
		List<Pelicula> sugeridas = super.sugerirPeliculas(decodificador);
		return sugeridas.stream().filter(p -> decodificador.contienePeliculaSimilar(p)).limit(3).toList();
	}
	
	
}
