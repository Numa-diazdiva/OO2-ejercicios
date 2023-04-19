package oo2.ejercicio14_FileManager;

import java.time.LocalDate;

public class FileOO2 implements Imprimible {

	private String nombre, extension;
	private int tamanio;
	private LocalDate fechaDeCreacion, fechaDeModificacion;
	private String permisos;
	
	public FileOO2(String nombre, String extension, int tamanio, String permisos) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamanio = tamanio;
		this.fechaDeCreacion = LocalDate.now();
		this.fechaDeModificacion = LocalDate.now();
		this.permisos = permisos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public LocalDate getFechaDeModificacion() {
		return fechaDeModificacion;
	}

	public void setFechaDeModificacion(LocalDate fechaDeModificacion) {
		this.fechaDeModificacion = fechaDeModificacion;
	}

	public String getPermisos() {
		return permisos;
	}

	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}

	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}
	
	public String printFechaDeCreacion() {
		return this.fechaDeCreacion.toString();
	}
	
	public String printFechaDeModificacion() {
		return this.fechaDeModificacion.toString();
	}
	
	public String prettyPrint() {
		return "| extensión: " + this.extension;
	}
	
	public boolean esArchivo() {
		return true;
	}
	
	public void setArchivo(FileOO2 archivo) {}
	
}
