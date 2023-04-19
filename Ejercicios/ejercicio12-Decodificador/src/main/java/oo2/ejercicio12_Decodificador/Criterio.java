package oo2.ejercicio12_Decodificador;

import java.util.Comparator;
import java.util.List;

public abstract class Criterio {

	/*
	 * Template method: retorna únicamente las películas no vistas ordenadas por año de estreno descendente
	 * */
	public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		List<Pelicula> recomendadas = decodificador.peliculasNoVistas();
		return recomendadas.stream()
				.sorted(Comparator.comparingInt(Pelicula::getAnioDeEstreno).reversed())
				.toList();
	}
	

	
}
