package oo2.ejercicio12_Decodificador;

import java.util.Comparator;

public class Puntaje extends Criterio {
	
	protected Comparator<Pelicula> criterioDeOrden() {
		
		/*
		 * Compara primero por puntaje, luego por año de estreno.
		 * - También se puede definir el comparador pasando una función (el compilador
		 * sabe que debe hacer Override sobre el compare),
		 * - También se puede usar la sintaxis provista por la API:
		 * 			Comparator.comparingDouble(Pelicula::getPuntaje)
		 * 			.thenComparingInt() (...) 
		 * */
		return new Comparator<Pelicula>() {
			
			@Override
			public int compare(Pelicula p1, Pelicula p2) {
				if(p1.getPuntaje() == p2.getPuntaje()) {
					return Integer.compare(p2.getAnioDeEstreno(), p1.getAnioDeEstreno());
				}
				else {
					return Double.compare(p2.getPuntaje(), p1.getPuntaje());
				}
			}
			
		};
	}
	
}





/*
 * 	Vieja versión
 * 
 * 	public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		List<Pelicula> sugeridas = super.sugerirPeliculas(decodificador);
		// Consultar comparators: reversed no funcionando con notación p -> p.getPuntaje()
		return sugeridas.stream().sorted(Comparator.comparingDouble(Pelicula::getPuntaje).reversed()).limit(3).toList();
	}
 * 
 * 
 * 
 * */
 