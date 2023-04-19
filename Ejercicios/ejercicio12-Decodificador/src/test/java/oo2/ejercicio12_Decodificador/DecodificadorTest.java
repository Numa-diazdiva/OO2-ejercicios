package oo2.ejercicio12_Decodificador;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	
	private Decodificador decodificador;
	private Criterio novedad, similaridad, puntaje;
	private Pelicula thor, capitanAmerica, ironMan, dunkirk, rocky, rambo;
	private List<Pelicula> todasPeliculas;
	
	void instanciarPeliculas() {
		this.thor = new Pelicula("Thor", 2007, 7.9);
		this.capitanAmerica = new Pelicula("Capitan America", 2016, 7.8);
		this.ironMan = new Pelicula("Iron man", 2010, 7.9);
		this.dunkirk = new Pelicula("Dunkirk", 2017, 7.9);
		this.rocky = new Pelicula("Rocky", 1976, 8.1);
		this.rambo = new Pelicula("Rambo", 1979, 7.8);
		this.todasPeliculas = new ArrayList<Pelicula>();
		
		todasPeliculas.add(thor);
		todasPeliculas.add(capitanAmerica);
		todasPeliculas.add(ironMan);
		todasPeliculas.add(dunkirk);
		todasPeliculas.add(rocky);
		todasPeliculas.add(rambo);
		
		thor.agregarSimilar(capitanAmerica);
		thor.agregarSimilar(ironMan);
		
		capitanAmerica.agregarSimilar(thor);
		capitanAmerica.agregarSimilar(ironMan);
		
		ironMan.agregarSimilar(thor);
		ironMan.agregarSimilar(capitanAmerica);

		rambo.agregarSimilar(rocky);
		rocky.agregarSimilar(rambo);
	}
	
	@BeforeEach
	void setUp() {
		this.decodificador = new Decodificador();
		this.novedad = new Novedad();
		this.similaridad = new Similaridad();
		this.puntaje = new Puntaje();
		this.instanciarPeliculas();
		this.decodificador.agregarAlCatalogo(this.todasPeliculas);
		this.decodificador.agregarPeliculaReproducida(thor);
		this.decodificador.agregarPeliculaReproducida(rocky);
	}
	
	@Test
	void testCriterioNovedad() {
		List<Pelicula> sugeridas = this.decodificador.sugerirPeliculas();
		assertTrue(sugeridas.get(0).esIgualA(dunkirk.getTitulo()));
		assertTrue(sugeridas.get(1).esIgualA(capitanAmerica.getTitulo()));
		assertTrue(sugeridas.get(2).esIgualA(ironMan.getTitulo()));
		assertFalse(sugeridas.contains(thor));
		assertFalse(sugeridas.contains(rocky));
		assertFalse(sugeridas.contains(rambo));
	}
	
	@Test
	void testCriterioSimilaridad() {
		this.decodificador.setCriterio(similaridad);
		List<Pelicula> sugeridas = this.decodificador.sugerirPeliculas();
		assertTrue(sugeridas.get(0).esIgualA(capitanAmerica.getTitulo()));
		assertTrue(sugeridas.get(1).esIgualA(ironMan.getTitulo()));
		assertTrue(sugeridas.get(2).esIgualA(rambo.getTitulo()));
		assertFalse(sugeridas.contains(thor));
		assertFalse(sugeridas.contains(rocky));
		assertFalse(sugeridas.contains(dunkirk));
	}
	
	
	@Test
	void testCriterioPuntaje() {
		this.decodificador.setCriterio(puntaje);
		List<Pelicula> sugeridas = this.decodificador.sugerirPeliculas();
		assertTrue(sugeridas.get(0).esIgualA(dunkirk.getTitulo()));
		assertTrue(sugeridas.get(1).esIgualA(ironMan.getTitulo()));
		assertTrue(sugeridas.get(2).esIgualA(capitanAmerica.getTitulo()));
		assertFalse(sugeridas.contains(thor));
		assertFalse(sugeridas.contains(rocky));
		assertFalse(sugeridas.contains(rambo));
	}
	
	
	
}
