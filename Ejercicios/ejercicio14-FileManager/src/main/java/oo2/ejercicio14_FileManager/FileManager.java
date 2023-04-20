package oo2.ejercicio14_FileManager;

import java.util.ArrayList;
import java.util.List;

public class FileManager {

	private List<FileOO2> archivos;
	private Vista vista;
	
	public FileManager() {
		this.archivos = new ArrayList<FileOO2>();
		this.vista = new VistaNombre();
	}
	
	public void agregarArchivo(FileOO2 archivo) {
		this.archivos.add(archivo);
	}
	
	// No se tiene en cuenta en esta instancia de ejercicio
	public void agregarVistaAlPrincipio(Vista vista) {
		vista.setComponente(this.vista);
		this.setVista(vista);
	}
	
	public void setVista(Vista vista) {
		this.vista = vista;
	}
	
	public void resetVista() {
		this.vista = new VistaNombre();
	}
	
	/*
	 * Ésto es otro problema
	 * */
	
//	public String imprimirArchivo(FileOO2 archivo) {
//		this.vista.setArchivo(archivo);
//		return this.vista.prettyPrint();
//	}
	
}
