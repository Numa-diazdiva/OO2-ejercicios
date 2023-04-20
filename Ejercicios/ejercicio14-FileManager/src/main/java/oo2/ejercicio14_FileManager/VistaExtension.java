package oo2.ejercicio14_FileManager;

public class VistaExtension extends Vista {

	@Override
	public String prettyPrint() {
		return " | Extensión: " + this.getExtension() + super.prettyPrint();
	}
	
}
