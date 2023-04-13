package oo2.ejercicio7_Excursiones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import oo2.ejercicio8_Excursiones.Excursion;
import oo2.ejercicio8_Excursiones.Usuario;

/*
 * Escriba un test para inscribir a un usuario en la excursión “Dos días en kayak bajando el Paraná”,
 * con cupo mínimo de 1 persona y cupo máximo 2, con dos personas ya inscriptas.
 * Implemente todos los mensajes que considere necesarios.
 * */


public class ExcursionTest {
	private Excursion excursion;
	private Usuario usuario1, usuario2, usuario3;
	
	@BeforeEach
	void setUp() {
		this.excursion = new Excursion("Dos días en kayac bajando el Paraná", LocalDate.of(2023, 4, 20), LocalDate.of(2023, 4, 22), "Cabaña La Paloma", 1, 2, 23000);
		this.usuario1 = new Usuario("Matías", "Mackwinson", "matmac@gmail.com");
		this.usuario2 = new Usuario("Lucila", "Pastrana", "lucy20@gmail.com");
		this.usuario3 = new Usuario("Quimey", "Bosch", "quimbosch@gmail.com");
	}
	
	@Test
	void testInscripcionListaDeEspera() {
		excursion.inscribirUsuario(usuario1);
		System.out.println(excursion.obtenerInformacion());
		excursion.inscribirUsuario(usuario2);
		System.out.println(excursion.obtenerInformacion());
		excursion.inscribirUsuario(usuario3);
		System.out.println(excursion.obtenerInformacion());

		assertTrue(excursion.usuariosInscriptos().contains(usuario1));
		assertTrue(excursion.usuariosInscriptos().contains(usuario2));
		assertFalse(excursion.usuariosInscriptos().contains(usuario3));
		assertEquals(excursion.getCantInscriptos(), 2);
		assertTrue(excursion.listaDeEspera().contains(usuario3));

	}
	
	
	
}
