package oo2.ejercicio14_FileManager;

public interface Imprimible {

	public String prettyPrint();
	
	public String getNombre();
	
	public String getExtension();
	
	public int getTamanio();
	
	public String printFechaDeCreacion();
	
	public String printFechaDeModificacion();
	
	public String getPermisos();
	
	public void setArchivo(FileOO2 archivo);
	
	public boolean esArchivo();
	
}
