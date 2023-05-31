package oo2.ejercicio18_SubteWay;

public class FabricaVegano extends FabricaDeSanguches {

	@Override
	public void agregarPan(Sanguche sanguche) {
		sanguche.agregarIngrediente(new Ingrediente("Pan integral", 100));
	}

	@Override
	public void agregarAderezo(Sanguche sanguche) {
		sanguche.agregarIngrediente(new Ingrediente("Salsa criolla", 20));
	}

	@Override
	public void agregarPrincipal(Sanguche sanguche) {
		sanguche.agregarIngrediente(new Ingrediente("Milanesa de girgolas", 500));
		
	}

	@Override
	public void agregarAdicional(Sanguche sanguche) {
	}


	
	
}
