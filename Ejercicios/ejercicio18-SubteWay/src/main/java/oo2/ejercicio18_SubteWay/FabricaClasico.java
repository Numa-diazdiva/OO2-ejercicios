package oo2.ejercicio18_SubteWay;

public class FabricaClasico extends FabricaDeSanguches {

	@Override
	public void agregarPan() {
		this.getSanguche().agregarIngrediente(new Ingrediente("Pan brioche", 100));		
	}

	@Override
	public void agregarAderezo() {
		this.getSanguche().agregarIngrediente(new Ingrediente("Mayonesa", 20));		
		
	}

	@Override
	public void agregarPrincipal() {
		this.getSanguche().agregarIngrediente(new Ingrediente("Ternera", 300));		
		
	}

	@Override
	public void agregarAdicional() {
		this.getSanguche().agregarIngrediente(new Ingrediente("Tomate", 80));
		
	}

}
