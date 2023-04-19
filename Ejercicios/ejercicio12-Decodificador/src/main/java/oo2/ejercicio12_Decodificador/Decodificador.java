package oo2.ejercicio12_Decodificador;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	
	private List<Pelicula> catalogoDePeliculas, peliculasReproducidas;
	private Criterio criterio;
	
	public Decodificador() {
		this.catalogoDePeliculas = new ArrayList<Pelicula>();
		this.peliculasReproducidas = new ArrayList<Pelicula>();
		this.criterio = new Novedad();
	}

	public List<Pelicula> getCatalogoDePeliculas() {
		return catalogoDePeliculas;
	}

	public List<Pelicula> getPeliculasReproducidas() {
		return peliculasReproducidas;
	}
	
	public void agregarPeliculaReproducida(Pelicula pelicula) {
		this.peliculasReproducidas.add(pelicula);
	}
	
	public void agregarAlCatalogo(Pelicula pelicula) {
		this.catalogoDePeliculas.add(pelicula);
	}
	
	public void agregarAlCatalogo(List<Pelicula> peliculas) {
		this.catalogoDePeliculas.addAll(peliculas);
	}
	
	public boolean fueReproducida(Pelicula pelicula) {
		return this.peliculasReproducidas.stream().anyMatch(p -> p.esIgualA(pelicula.getTitulo()));
	}
	
	public List<Pelicula> peliculasNoVistas() {
		return this.catalogoDePeliculas.stream().filter(p -> !this.fueReproducida(p)).toList();
	}
	
	public boolean contienePeliculaSimilar(Pelicula pelicula) {
		return this.peliculasReproducidas.stream().anyMatch(p -> p.esSimilarA(pelicula));
	}
	
	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}
	
	public List<Pelicula> sugerirPeliculas() {
		return this.criterio.sugerirPeliculas(this);
	}
	
	
}
