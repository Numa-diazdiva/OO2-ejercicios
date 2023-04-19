package oo2.ejercicio14_FileManager;

public class VistaTamanio extends Vista {

	public VistaTamanio(Imprimible componente) {
		super(componente);
	}
	
	public VistaTamanio() {}

	@Override
	public String prettyPrint() {
		return "| Tamanio: " + this.getTamanio() + this.getComponente().prettyPrint(); 
	}
	
}
	
	
