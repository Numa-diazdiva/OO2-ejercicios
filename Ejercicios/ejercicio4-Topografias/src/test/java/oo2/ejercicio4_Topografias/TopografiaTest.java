package oo2.ejercicio4_Topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	
	private Topografia terreno;
	private Topografia hojaAgua, hojaTierra;
	
	
	@BeforeEach
	void setUp() {
		this.hojaAgua = new Agua();
		this.hojaTierra = new Tierra();
	}
	
	@Test
	void testTodoAgua() {
		this.terreno = new Mixta(hojaAgua, new Agua(), new Agua(), new Agua());
		assertEquals(terreno.proporcionDeAgua(), 1);
	}
	
	@Test
	void testTodoTierra() {
		this.terreno = new Mixta(hojaTierra, new Tierra(), new Tierra(), new Tierra());
		assertEquals(terreno.proporcionDeAgua(), 0);
	}
	
	@Test
	void testMezclaDeHojas() {
		this.terreno = new Mixta(hojaAgua, new Agua(), new Tierra(), new Tierra());
		assertEquals(terreno.proporcionDeAgua(), 0.5);
		this.terreno = new Mixta(hojaAgua, new Tierra(), new Tierra(), new Tierra());
		assertEquals(terreno.proporcionDeAgua(), 0.25);
	}
	
	@Test
	void testMezclaHojasComposiciones() {
		Mixta mixta1 = new Mixta(hojaAgua, new Agua(), new Tierra(), new Agua());
		assertEquals(0.75, mixta1.proporcionDeAgua());
		this.terreno = new Mixta(hojaTierra, new Tierra(), mixta1, new Agua());
		assertEquals(0.4375, terreno.proporcionDeAgua());
	}
	
	
}
