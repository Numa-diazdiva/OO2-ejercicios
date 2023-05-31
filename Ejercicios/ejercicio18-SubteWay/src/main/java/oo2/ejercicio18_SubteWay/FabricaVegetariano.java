package oo2.ejercicio18_SubteWay;

public class FabricaVegetariano extends FabricaDeSanguches {

	@Override
	public void agregarPan(Sanguche sanguche) {
		sanguche.agregarIngrediente(new Ingrediente("Pan con semillas", 120));		
	}

	@Override
	public void agregarAderezo(Sanguche sanguche) {		
	}

	@Override
	public void agregarPrincipal(Sanguche sanguche) {
		sanguche.agregarIngrediente(new Ingrediente("Provoleta grillada", 200));		
		
	}

	@Override
	public void agregarAdicional(Sanguche sanguche) {
		sanguche.agregarIngrediente(new Ingrediente("Berenjenas al escabeche", 100));
	}
	
	
}
