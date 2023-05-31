package oo2.ejercicio18_SubteWay;

public abstract class FabricaDeSanguches {

	public abstract void agregarPan(Sanguche sanguche);
	public abstract void agregarAderezo(Sanguche sanguche);
	public abstract void agregarPrincipal(Sanguche sanguche);
	public abstract void agregarAdicional(Sanguche sanguche);

	public Sanguche fabricarSanguche() {
		Sanguche nuevoSanguche = new Sanguche();
		this.agregarPan(nuevoSanguche);
		this.agregarAderezo(nuevoSanguche);
		this.agregarPrincipal(nuevoSanguche);
		this.agregarAdicional(nuevoSanguche);
		return nuevoSanguche;
	}
	
}
