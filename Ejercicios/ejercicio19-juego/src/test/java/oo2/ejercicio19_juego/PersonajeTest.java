package oo2.ejercicio19_juego;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonajeTest {
	
	public Juego juego;
	private Personaje mago, arquero, guerrero;
	private FabricaPersonaje fabricaMago, fabricaArquero, fabricaGuerrero;
	
	@BeforeEach
	void setUp() {
		this.juego = new Juego();
		this.fabricaMago = new MagoFabrica();
		this.fabricaArquero = new ArqueroFabrica();
		this.fabricaGuerrero = new GuerreroFabrica();
	}
	
	
	
	@Test
	void testEnfrentamientoMagoGuerrero() {
		// El test de la fábrica no debería estar acá, refactorizar
		this.juego.setFabricaPersonajes(fabricaMago);
		this.mago = this.juego.crearPersonaje();
		assertEquals("Mago", this.mago.getNombre());
		this.juego.setFabricaPersonajes(fabricaGuerrero);
		this.guerrero = this.juego.crearPersonaje();
		assertEquals("Guerrero", this.guerrero.getNombre());
		
		this.mago.atacar(guerrero);
		assertEquals(99, guerrero.getVida());
		
		this.guerrero.atacar(mago);
		assertEquals(92, mago.getVida());
		
	}
	
	@Test
	void testEnfrentamientoMagoArquero() {
		this.juego.setFabricaPersonajes(fabricaMago);
		this.mago = this.juego.crearPersonaje();
		assertEquals("Mago", this.mago.getNombre());
		this.juego.setFabricaPersonajes(fabricaArquero);
		this.arquero = this.juego.crearPersonaje();
		assertEquals("Arquero", this.arquero.getNombre());
		
		this.mago.atacar(arquero);
		assertEquals(98, arquero.getVida());
		
		this.arquero.atacar(mago);
		assertEquals(95, mago.getVida());
		
	}
	
	@Test
	void testEnfrentamientoArqueroGuerrero() {
		this.juego.setFabricaPersonajes(fabricaGuerrero);
		this.guerrero = this.juego.crearPersonaje();
		this.juego.setFabricaPersonajes(fabricaArquero);
		this.arquero = this.juego.crearPersonaje();
		
		this.guerrero.atacar(arquero);
		assertEquals(92, arquero.getVida());
		
		this.arquero.atacar(guerrero);
		assertEquals(98, guerrero.getVida());
		
	}
	
	
}
