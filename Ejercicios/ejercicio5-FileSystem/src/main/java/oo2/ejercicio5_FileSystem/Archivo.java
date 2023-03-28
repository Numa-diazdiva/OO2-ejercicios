package oo2.ejercicio5_FileSystem;

import java.time.LocalDate;

public class Archivo extends FileSystemComponent {
	
	private int tamano;
	
	public Archivo(String nombre, LocalDate fecha, int tamano) {
		super(nombre, fecha);
		this.tamano = tamano;
	}

	@Override
	public int tamanoTotalOcupado() {	
		return this.tamano;
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {	
		return this;
	}

	
}
