package oo2.ejercicio14_FileManager;

public class VistaPermisos extends Vista {

	public VistaPermisos(Imprimible componente) {
		super(componente);
	}
	
	public VistaPermisos() {}
	
	@Override
	public String prettyPrint() {
		return " | Permisos: " + this.getPermisos() + super.prettyPrint();
	}
	
}
