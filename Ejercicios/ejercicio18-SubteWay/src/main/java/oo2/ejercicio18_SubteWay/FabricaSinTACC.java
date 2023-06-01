package oo2.ejercicio18_SubteWay;

public class FabricaSinTACC extends FabricaDeSanguches {

	@Override
	public void agregarPan() {
		this.getSanguche().agregarIngrediente(new Ingrediente("Pan de chipá", 150));		
	}

	@Override
	public void agregarAderezo() {
		this.getSanguche().agregarIngrediente(new Ingrediente("Salsa tártara", 18));		
	}

	@Override
	public void agregarPrincipal() {
		this.getSanguche().agregarIngrediente(new Ingrediente("Pollo", 250));		
		
	}

	@Override
	public void agregarAdicional() {
		this.getSanguche().agregarIngrediente(new Ingrediente("Verduras grilladas", 200));
	}
	
}
