package oo2.ejercicio14_FileManager;

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
	void testVistaDefault() {
		System.out.println(fileManager.imprimirArchivo(archivo1));
	}
	
	@Test
	void testVistaCustom1() {
		this.permisos = new VistaPermisos();
		this.fileManager.agregarVistaAlPrincipio(permisos);
		System.out.println(fileManager.imprimirArchivo(archivo1));
	}
	
	
	
}
