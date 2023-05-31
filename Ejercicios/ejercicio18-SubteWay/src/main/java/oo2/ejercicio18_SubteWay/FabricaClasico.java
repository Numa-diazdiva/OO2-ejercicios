package oo2.ejercicio18_SubteWay;

public class FabricaClasico extends FabricaDeSanguches {

	@Override
	public void agregarPan(Sanguche sanguche) {
		sanguche.agregarIngrediente(new Ingrediente("Pan brioche", 100));		
	}

	@Override
	public void agregarAderezo(Sanguche sanguche) {
		sanguche.agregarIngrediente(new Ingrediente("Mayonesa", 20));		
		
	}

	@Override
	public void agregarPrincipal(Sanguche sanguche) {
		sanguche.agregarIngrediente(new Ingrediente("Ternera", 300));		
		
	}

	@Override
	public void agregarAdicional(Sanguche sanguche) {
		sanguche.agregarIngrediente(new Ingrediente("Tomate", 80));
		
	}

}
