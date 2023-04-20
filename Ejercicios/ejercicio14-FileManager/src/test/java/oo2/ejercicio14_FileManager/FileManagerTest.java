package oo2.ejercicio14_FileManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileManagerTest {

	private FileManager fileManager;
	private Vista nombre, tamanio, permisos, fechaCreacion, fechaModificacion;
	private FileOO2 archivo1, archivo2;
	
	
	@BeforeEach
	void setUp() {
		this.fileManager = new FileManager();
		this.archivo1 = new FileOO2("Documento1", ".odt", 16, "solo lectura");
		this.archivo2 = new FileOO2("Plata", ".jpg", 260000, "escritura");
		this.fileManager.agregarArchivo(archivo1);
		this.fileManager.agregarArchivo(archivo2);
	}
	
	
	@Test
	void testVistaCustom1() {
		this.nombre = new VistaNombre(archivo1);
		System.out.println(nombre.prettyPrint());
		String resultadoEsperado = " | Nombre: Documento1";
		assertEquals(nombre.prettyPrint(), resultadoEsperado);
	}
	
	@Test
	void testVistaCustom2() {
		this.permisos = new VistaPermisos(archivo1);
		this.fechaCreacion = new VistaFechaDeCreacion(permisos);
		System.out.println(fechaCreacion.prettyPrint());
		String resultadoEsperado = " | Fecha de creación: 2023-04-20 | Permisos: solo lectura";
		assertEquals(fechaCreacion.prettyPrint(), resultadoEsperado);
	}
	
	
	@Test
	void testVistaCustom3() {
		this.fechaCreacion = new VistaFechaDeCreacion(archivo1);
		this.permisos = new VistaPermisos(fechaCreacion);
		this.tamanio = new VistaTamanio(permisos);
		System.out.println(tamanio.prettyPrint());
		String resultadoEsperado = " | Tamanio: 16 | Permisos: solo lectura | Fecha de creación: 2023-04-20";
		assertEquals(tamanio.prettyPrint(), resultadoEsperado);
	}
	
	
	
}
