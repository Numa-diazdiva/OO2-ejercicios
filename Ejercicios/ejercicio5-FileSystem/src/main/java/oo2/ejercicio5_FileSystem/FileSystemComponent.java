package oo2.ejercicio5_FileSystem;

import java.time.LocalDate;

// Esta vez como clase abstracta
public abstract class FileSystemComponent {
	private String nombre;
	private LocalDate fecha;
	
	public FileSystemComponent(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	public int compararFecha(LocalDate otraFecha) {
		return this.fecha.compareTo(otraFecha);
	}
	
	public abstract int tamanoTotalOcupado();
	
	public abstract Archivo archivoMasGrande();
	
	public abstract Archivo archivoMasNuevo();

	
}
