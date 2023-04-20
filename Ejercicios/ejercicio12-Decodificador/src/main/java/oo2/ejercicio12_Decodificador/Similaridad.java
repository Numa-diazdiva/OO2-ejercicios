package oo2.ejercicio12_Decodificador;

import java.util.Collection;
import java.util.List;

public class Similaridad extends Criterio {
	
	/*
	 * Redefino criterio para recomendar
	 * */
	protected Collection<Pelicula> obtenterRecomendadas(Decodificador decodificador, List<Pelicula> noVistas) {
		// Falta una vuelta de rosca: de las que vio -> Set(similares - las que vio) => similares que no vio => p.esIgualA()
		return noVistas.stream().filter(p -> decodificador.contienePeliculaSimilar(p)).toList();
	}
	
}







/*	
 * Vieja implementación
 * 
 * 	public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		// Le digo al contexto, reprodujiste alguna similar a ésta?
		// O le digo a la película, sos similar a alguna de éstas?
		List<Pelicula> sugeridas = super.sugerirPeliculas(decodificador);
		return sugeridas.stream().filter(p -> decodificador.contienePeliculaSimilar(p)).limit(3).toList();
	}
 * */
 