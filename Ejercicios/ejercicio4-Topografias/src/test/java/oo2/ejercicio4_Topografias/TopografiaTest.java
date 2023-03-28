package oo2.ejercicio4_Topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

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
	
	// Por ahora el equals de la lista chequea objetos idénticos
	@Test
	void testIgualdadOK() {
		Topografia mixta1 = new Mixta(hojaAgua, new Agua(), new Tierra(), new Agua());
		this.terreno = new Mixta(mixta1, hojaTierra, hojaAgua, new Agua());
		Topografia mixta2 = new Mixta(hojaAgua, new Agua(), new Tierra(), new Agua());
		List<Topografia> mixta3 = terreno.getChildren();
		Topografia otroTerreno = new Mixta(mixta3.get(0), mixta3.get(1), mixta3.get(2), mixta3.get(3));
		assertTrue(this.terreno.sonIguales(otroTerreno));
	}
	
	
}
