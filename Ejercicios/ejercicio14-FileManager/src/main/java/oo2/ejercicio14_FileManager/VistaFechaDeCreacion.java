package oo2.ejercicio14_FileManager;

public class VistaFechaDeCreacion extends Vista {

	public VistaFechaDeCreacion(Imprimible componente) {
		super(componente);
	}
	
	public VistaFechaDeCreacion() {}
	
	public String prettyPrint() {
		return "| Fecha de creación: " + this.printFechaDeCreacion() + this.getComponente().prettyPrint();
	}

}
