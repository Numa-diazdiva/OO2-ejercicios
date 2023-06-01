package oo2.ejercicio18_SubteWay;

public class FabricaVegetariano extends FabricaDeSanguches {

	@Override
	public void agregarPan() {
		this.getSanguche().agregarIngrediente(new Ingrediente("Pan con semillas", 120));		
	}

	@Override
	public void agregarAderezo() {		
	}

	@Override
	public void agregarPrincipal() {
		this.getSanguche().agregarIngrediente(new Ingrediente("Provoleta grillada", 200));		
		
	}

	@Override
	public void agregarAdicional() {
		this.getSanguche().agregarIngrediente(new Ingrediente("Berenjenas al escabeche", 100));
	}
	
}
