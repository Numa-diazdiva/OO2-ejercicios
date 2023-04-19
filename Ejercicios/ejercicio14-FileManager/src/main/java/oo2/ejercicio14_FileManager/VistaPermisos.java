package oo2.ejercicio14_FileManager;

public class VistaPermisos extends Vista {

	public VistaPermisos(Imprimible componente) {
		super(componente);
	}
	
	public VistaPermisos() {}
	
	public String prettyPrint() {
		return "| Permisos: " + this.getPermisos() + this.getComponente().prettyPrint();
	}
	
}
