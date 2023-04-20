package oo2.ejercicio12_Decodificador;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public abstract class Criterio {

	/*
	 * Template method: siempre parte de las no vistas, pero permite redefinir el criterio de orden
	 * 					y demás operaciones sobre las noVistas en las subclases.
	 * */
	public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		List<Pelicula> noVistas = decodificador.peliculasNoVistas();
		return this.obtenterRecomendadas(decodificador, noVistas)
				.stream()
				.sorted(criterioDeOrden())
				.limit(3)
				.toList();
	}

	protected Collection<Pelicula> obtenterRecomendadas(Decodificador decodificador, List<Pelicula> noVistas) {
		return noVistas;
	}

	protected Comparator<Pelicula> criterioDeOrden() {
		return Comparator.comparingInt(Pelicula::getAnioDeEstreno).reversed();
	}
	
	
	
	
	
	
}
