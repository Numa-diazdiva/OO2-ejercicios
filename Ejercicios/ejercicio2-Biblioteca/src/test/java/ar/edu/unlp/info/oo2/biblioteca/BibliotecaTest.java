package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	Biblioteca biblioteca;
	
	@BeforeEach
	void setUp(){
		biblioteca =  new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
	}
	
	@Test
	public void testExportarSociosVoorhees() {
		biblioteca.setExporter(new VoorheesExporter());
		String sociosJSON = biblioteca.exportarSocios();
		assertTrue(sociosJSON.contains("Arya Stark"));
		assertTrue(sociosJSON.contains("Tyron Lannister"));
	}
	
	@Test
	public void testExportarSociosJSONSimple() {
		biblioteca.setExporter(new JSONSimpleAdapter());
		String sociosJSON = biblioteca.exportarSocios();
		assertTrue(sociosJSON.contains("Arya Stark"));
		assertTrue(sociosJSON.contains("Tyron Lannister"));
	}
	
	@Test
	public void testExportarSociosJackson() {
		biblioteca.setExporter(new JacksonAdapter());
		String sociosJSON = biblioteca.exportarSocios();
		assertTrue(sociosJSON.contains("Arya Stark"));
		assertTrue(sociosJSON.contains("Tyron Lannister"));
	}

}
