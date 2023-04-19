package oo2.ejercicio12_Decodificador;

import java.util.Comparator;
import java.util.List;

public class Puntaje extends Criterio {
	
	public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		List<Pelicula> sugeridas = super.sugerirPeliculas(decodificador);
		// Consultar comparators: reversed no funcionando con notación p -> p.getPuntaje()
		return sugeridas.stream().sorted(Comparator.comparingDouble(Pelicula::getPuntaje).reversed()).limit(3).toList();
	}
	
}
