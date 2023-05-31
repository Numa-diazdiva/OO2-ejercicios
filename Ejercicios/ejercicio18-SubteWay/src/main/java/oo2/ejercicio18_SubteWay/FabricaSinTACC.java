package oo2.ejercicio18_SubteWay;

public class FabricaSinTACC extends FabricaDeSanguches {

	@Override
	public void agregarPan(Sanguche sanguche) {
		sanguche.agregarIngrediente(new Ingrediente("Pan de chipá", 150));		
	}

	@Override
	public void agregarAderezo(Sanguche sanguche) {
		sanguche.agregarIngrediente(new Ingrediente("Salsa tártara", 18));		
	}

	@Override
	public void agregarPrincipal(Sanguche sanguche) {
		sanguche.agregarIngrediente(new Ingrediente("Pollo", 250));		
		
	}

	@Override
	public void agregarAdicional(Sanguche sanguche) {
		sanguche.agregarIngrediente(new Ingrediente("Verduras grilladas", 200));
	}
	
}
