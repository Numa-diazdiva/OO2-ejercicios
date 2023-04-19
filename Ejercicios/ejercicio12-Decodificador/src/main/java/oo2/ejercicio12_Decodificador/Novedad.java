package oo2.ejercicio12_Decodificador;

import java.util.List;

public class Novedad extends Criterio {

	public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		List<Pelicula> sugeridas = super.sugerirPeliculas(decodificador);
		return sugeridas.subList(0, 3);
	}
	
}
