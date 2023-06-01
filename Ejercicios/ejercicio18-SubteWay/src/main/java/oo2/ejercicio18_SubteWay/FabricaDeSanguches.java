package oo2.ejercicio18_SubteWay;

public abstract class FabricaDeSanguches {

	private Sanguche nuevoSanguche;
	
	public abstract void agregarPan();
	public abstract void agregarAderezo();
	public abstract void agregarPrincipal();
	public abstract void agregarAdicional();

	public void iniciarCreacion() {
		this.nuevoSanguche = new Sanguche();
	}
	
	public Sanguche obtenerProducto() {
		return this.nuevoSanguche;
	}
	
	protected Sanguche getSanguche() {
		return this.nuevoSanguche;
	}
}
