package oo2.ejercicio14_FileManager;

public class VistaFechaDeModificacion extends Vista {

	public VistaFechaDeModificacion(Imprimible componente) {
		super(componente);
	}
	
	public VistaFechaDeModificacion() {}
	
	@Override
	public String prettyPrint() {
		return " | Fecha de modificación: " + this.printFechaDeModificacion() + super.prettyPrint();
	}
	
}
