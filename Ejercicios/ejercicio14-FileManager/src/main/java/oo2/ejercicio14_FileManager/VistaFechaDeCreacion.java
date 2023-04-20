package oo2.ejercicio14_FileManager;

public class VistaFechaDeCreacion extends Vista {

	public VistaFechaDeCreacion(Imprimible componente) {
		super(componente);
	}
	
	public VistaFechaDeCreacion() {}
	
	@Override
	public String prettyPrint() {
		return " | Fecha de creación: " + this.printFechaDeCreacion() + super.prettyPrint();
	}

}
