package oo2.ejercicio5_FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio extends FileSystemComponent {

	private List<FileSystemComponent> contenido;
	
    public Directorio(String nombre, LocalDate fecha) {
    	super(nombre, fecha);
    	this.contenido = new ArrayList<FileSystemComponent>();
    }

    public void agregar(FileSystemComponent componente) {
    	this.contenido.add(componente);
    }
    
	/**
	* Retorna el espacio total ocupado, incluyendo su contenido.
	*/
    public int tamanoTotalOcupado() {
    	return 32 + this.contenido.stream().mapToInt(c -> c.tamanoTotalOcupado()).sum();
    }

	/**
	* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	* filesystem contenido por directorio receptor
	*/
    public Archivo archivoMasGrande() {
    	return this.contenido.stream().map(c -> c.archivoMasGrande())
    									.max(Comparator.comparingInt(c -> c.tamanoTotalOcupado()))
    									.orElse(null);
    }
    
    /**
	* Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	* del filesystem contenido por directorio receptor.
	*/
    public Archivo archivoMasNuevo() {
    	return this.contenido.stream().map(c -> c.archivoMasNuevo())
    									.max((a1, a2) -> a1.compararFecha(a2.getFecha()))
    									.orElse(null);
    									
    }

}

