package oo2.ejercicio1_RedSocial;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TwitterTest {

	private Usuario usuario1, usuario2;
	private Twitter twitter;
	
	@BeforeEach
	void setUp() {
		this.twitter = new Twitter();
		this.usuario1 = new Usuario("Fredersen123");
		this.usuario2 = new Usuario("María2023");
	}
	
	@Test
	void testAgregarUsuarioOK() {
		twitter.agregarUsuario(usuario1);
		twitter.agregarUsuario(usuario2);
		assertTrue(twitter.getUsuarios().contains(usuario1));
		assertTrue(twitter.getUsuarios().contains(usuario2));
	}
	
	@Test
	void testAgregarUsuarioFail() {
		twitter.agregarUsuario(usuario1);
		assertTrue(twitter.getUsuarios().contains(usuario1));
		this.usuario2 = new Usuario("Fredersen123");
		twitter.agregarUsuario(usuario2);
		assertFalse(twitter.getUsuarios().contains(usuario2));
	}
	
	
	
}
