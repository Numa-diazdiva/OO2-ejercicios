package oo2.ejercicio6_CalculoDeSueldos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

	private EmpleadoPasante pasante;
	private EmpleadoTemporario temporario;
	private EmpleadoDePlanta dePlanta;
	
	@BeforeEach
	void setUp() {
		this.pasante = new EmpleadoPasante(0, false);
		this.temporario = new EmpleadoTemporario(0, false);
		this.dePlanta = new EmpleadoDePlanta(0, false);
	}
	
	@Test
	void testSueldoPasante() {
		this.pasante.setExamenesRendidos(3);
		assertEquals(this.pasante.sueldo(), 23100);
	}

	@Test
	void testSueldoTemporario() {
		// Casado con 3 hijs
		this.temporario.setCantHijos(3);
		this.temporario.setEstaCasado(true);
		assertEquals(27850, this.temporario.sueldo());		
	}
	
	@Test
	void testSueldoDePlanta() {
		this.dePlanta.setAniosDeAntiguedad(5);
		this.dePlanta.setCantHijos(3);
		this.dePlanta.setEstaCasado(true);
		assertEquals(63450, this.dePlanta.sueldo());
	}
	
}
