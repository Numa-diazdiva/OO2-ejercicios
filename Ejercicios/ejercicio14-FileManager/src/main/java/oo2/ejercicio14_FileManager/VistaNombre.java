package oo2.ejercicio14_FileManager;

public class VistaNombre extends Vista{

	public VistaNombre(Imprimible componente) {
		super(componente);
	}
	
	public VistaNombre() {}

	@Override
	public String prettyPrint() {
		return "| Nombre: " + this.getNombre() + this.getComponente().prettyPrint(); 
	}
	
}
