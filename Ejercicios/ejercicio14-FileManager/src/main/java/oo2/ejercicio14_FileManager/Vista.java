package oo2.ejercicio14_FileManager;

public abstract class Vista implements Imprimible {

	private Imprimible componente;
	
	public Vista(Imprimible componente) {
		this.componente = componente;
	}
	
	public Vista() {}
	
	public void setComponente(Imprimible componente) {
		this.componente = componente;
	}
	
	public Imprimible getComponente () {
		return this.componente;
	}
	
	public abstract String prettyPrint();
	
	public String getNombre() {
		return this.componente.getNombre();
	}
	
	public String getExtension() {
		return this.componente.getExtension();
	}
	
	public int getTamanio() {
		return this.componente.getTamanio();
	}
	
	public String printFechaDeCreacion() {
		return this.componente.printFechaDeCreacion();
	}
	
	public String printFechaDeModificacion() {
		return this.componente.printFechaDeModificacion();
	}
	
	public String getPermisos() {
		return this.componente.getPermisos();
	}
	
	public boolean esArchivo() {
		return false;
	}
	
	public void setArchivo(FileOO2 archivo) {
		// Agrego el archivo a este componente si es el último (la vista aún no tiene nada seteado o es el último decorator)
		if (this.componente == null){
			this.setComponente(archivo);
		} else {
			if(this.componente.esArchivo())
			this.componente.setArchivo(archivo);
		}
	}
	
}
