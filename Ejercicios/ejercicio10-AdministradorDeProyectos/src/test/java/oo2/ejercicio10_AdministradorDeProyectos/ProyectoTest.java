package oo2.ejercicio10_AdministradorDeProyectos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {

	private Proyecto proyecto;
	
	@BeforeEach
	void setUp() {
		this.proyecto = new Proyecto(
				LocalDate.of(2023, 7, 1),
				LocalDate.of(2023, 7, 10),
				"Salir con amis",
				3,
				1000,
				5);
	}
	
	
	@Test
	void testCosto() {
		assertEquals(27000, proyecto.costo());
	}
	
	@Test
	void testPrecio() {
		assertEquals(28350, proyecto.precio());
	}
	
	@Test
	void testEtapaConstruccionAprobarOK() {
		proyecto.aprobarEtapa();
		assertEquals("En evaluación", proyecto.getEtapaActual().getNombreEtapa());
	}
	
	@Test
	void testEtapaConstruccionAprobarFail() {
		Proyecto proyecto2 = new Proyecto(LocalDate.of(2023, 7, 1),	LocalDate.of(2023, 7, 10), "asd", 3, 0, 5);
		try {
			proyecto2.aprobarEtapa();
		} catch (Exception e){
			assertEquals(e.getMessage(), "Error: El proyecto tiene un precio de 0.");
		}
		// Ésta es la forma de testear excepciones. Recordar que hay que pasar una lambda porque recibe un bloque de código. De
		// otra forma estaría recibiendo la excepción porque el método se ejecuta antes.
		assertThrows(RuntimeException.class, () -> proyecto2.aprobarEtapa());
	}
	
	@Test
	void testEtapaConstruccionActualizarMargenOK() {
		proyecto.actualizarMargenDeGanancia(9);
		assertEquals(9, proyecto.getMargenDeGanancia());
	}
	
	@Test
	void testEtapaConstruccionActualizarMargenFailAlto() {
		proyecto.actualizarMargenDeGanancia(19);
		assertEquals(5, proyecto.getMargenDeGanancia());
	}
	
	@Test
	void testEtapaConstruccionActualizarMargenFailBajo() {
		proyecto.actualizarMargenDeGanancia(7);
		assertEquals(5, proyecto.getMargenDeGanancia());
	}
	
	@Test
	void testEtapaConstruccionCancelarProyecto() {
		proyecto.cancelar();
		assertEquals("Cancelado", proyecto.getObjetivo());
		assertEquals("Cancelado", proyecto.getEtapaActual().getNombreEtapa());
	}
	
	@Test
	void testEtapaEvaluacionAprobar() {
		proyecto.aprobarEtapa();
		proyecto.aprobarEtapa();
		assertEquals("Confirmado", proyecto.getEtapaActual().getNombreEtapa());
	}
	
	@Test
	void testEtapaEvaluacionActualizarMargenOK() {
		proyecto.aprobarEtapa();
		proyecto.actualizarMargenDeGanancia(11);
		assertEquals(11, proyecto.getMargenDeGanancia());
	}
	
	@Test
	void testEtapaEvaluacionActualizarMargenFailAlto() {
		proyecto.aprobarEtapa();
		proyecto.actualizarMargenDeGanancia(16);
		assertEquals(5, proyecto.getMargenDeGanancia());
	}
	
	@Test
	void testEtapaEvaluacionActualizarMargenFailBajo() {
		proyecto.aprobarEtapa();
		proyecto.actualizarMargenDeGanancia(10);
		assertEquals(5, proyecto.getMargenDeGanancia());
	}
	
	@Test
	void testEtapaEvaluacionCancelarProyecto() {
		proyecto.aprobarEtapa();
		proyecto.cancelar();
		assertEquals("Cancelado", proyecto.getObjetivo());
		assertEquals("Cancelado", proyecto.getEtapaActual().getNombreEtapa());
	}
	
	@Test
	void testEtapaConfirmadoAprobarEtapa() {
		proyecto.aprobarEtapa();
		proyecto.aprobarEtapa();
		assertEquals("Confirmado", proyecto.getEtapaActual().getNombreEtapa());
		proyecto.aprobarEtapa();
		assertEquals("Confirmado", proyecto.getEtapaActual().getNombreEtapa());
	}
	
	@Test
	void testEtapaConfirmadoModificarMargen() {
		proyecto.aprobarEtapa();
		proyecto.aprobarEtapa();
		proyecto.actualizarMargenDeGanancia(10);
		assertEquals(5, proyecto.getMargenDeGanancia());
		proyecto.actualizarMargenDeGanancia(20);
		assertEquals(5, proyecto.getMargenDeGanancia());
	}
	
	@Test
	void testEtapaConfirmadoCancelarProyecto() {
		proyecto.aprobarEtapa();
		proyecto.aprobarEtapa();
		proyecto.cancelar();
		assertEquals("Cancelado", proyecto.getObjetivo());
		assertEquals("Cancelado", proyecto.getEtapaActual().getNombreEtapa());
	}
	
	@Test
	void testEtapaCanceladoAprobarEtapa() {
		proyecto.cancelar();
		assertEquals("Cancelado", proyecto.getObjetivo());
		proyecto.aprobarEtapa();
		assertEquals("Cancelado", proyecto.getEtapaActual().getNombreEtapa());
	}
	
	@Test
	void testEtapaCanceladoModificarMargenDeGanancia() {
		proyecto.cancelar();
		assertEquals("Cancelado", proyecto.getObjetivo());
		proyecto.actualizarMargenDeGanancia(15);
		assertEquals(5, proyecto.getMargenDeGanancia());
	}
	
	@Test
	void testEtapaCanceladaCancelar() {
		proyecto.cancelar();
		assertEquals("Cancelado", proyecto.getObjetivo());
		assertEquals("Cancelado", proyecto.getEtapaActual().getNombreEtapa());
		proyecto.cancelar();
		assertEquals("Cancelado", proyecto.getEtapaActual().getNombreEtapa());
	}
}