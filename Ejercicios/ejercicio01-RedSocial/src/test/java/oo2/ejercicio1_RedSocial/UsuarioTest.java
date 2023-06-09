package oo2.ejercicio1_RedSocial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	private Usuario usuario1, usuario2;
	private Tweet tweet1, tweet2;
	
	@BeforeEach
	void setUp() {
		this.usuario1 = new Usuario("Fredersen123");
		this.usuario2 = new Usuario("María2023");
	}
	
	@Test
	void twittearOKTest() {
		tweet1 = usuario1.twittear("Hola soy Fredersen");
		assertEquals(tweet1.getTexto(), "Hola soy Fredersen");
		assertTrue(usuario1.getTweets().contains(tweet1));
	}
	
	@Test
	void twittearFailLargoTest() {
		tweet1 = usuario1.twittear("Hola soy Maria. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada. No somos nada.");
		assertNull(tweet1);
	}
	
	@Test
	void twittearFailCortoTest() {
		tweet1 = usuario1.twittear("");
		assertNull(tweet1);
	}
	
	@Test
	void reTwittearTest() {
		tweet1 = usuario1.twittear("Hola soy Fredersen, ayuda");
		tweet2 = usuario2.reTwittear("Hola Fredersen, soy María", tweet1);
		assertEquals(tweet2.getReTweet(), tweet1);
	}
	
	
}
