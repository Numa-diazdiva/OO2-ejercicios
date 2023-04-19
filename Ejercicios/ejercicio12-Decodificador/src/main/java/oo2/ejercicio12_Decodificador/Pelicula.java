package oo2.ejercicio12_Decodificador;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private String titulo;
	private int anioDeEstreno;
	private double puntaje;
	private List<Pelicula> peliculasSimilares;
	
	public Pelicula(String titulo, int anioDeEstreno, double puntaje) {
		this.titulo = titulo;
		this.anioDeEstreno = anioDeEstreno;
		this.puntaje = puntaje;
		this.peliculasSimilares = new ArrayList<Pelicula>();
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnioDeEstreno() {
		return anioDeEstreno;
	}

	public void setAnioDeEstreno(int anioDeEstreno) {
		this.anioDeEstreno = anioDeEstreno;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}

	public List<Pelicula> getPeliculasSimilares() {
		return peliculasSimilares;
	}

	public void setPeliculasSimilares(List<Pelicula> peliculasSimilares) {
		this.peliculasSimilares = peliculasSimilares;
	}

	public void agregarSimilar(Pelicula pelicula) {
		this.peliculasSimilares.add(pelicula);
	}
	
	public boolean esIgualA(String titulo) {
		return this.titulo == titulo;
	}
	
	public boolean esSimilarA(Pelicula pelicula) {
		return this.peliculasSimilares.stream().anyMatch(p -> p.esIgualA(pelicula.getTitulo()));
	}
	
}
