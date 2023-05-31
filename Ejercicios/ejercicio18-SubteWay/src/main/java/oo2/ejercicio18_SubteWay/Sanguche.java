package oo2.ejercicio18_SubteWay;

import java.util.ArrayList;
import java.util.List;

public class Sanguche {
	private List<Ingrediente> ingredientes;
	
	public Sanguche() {
		this.ingredientes = new ArrayList<Ingrediente>();
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	
	public void agregarIngrediente(Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);
	}
	
	public double precio() {
		return this.ingredientes.stream().mapToDouble(i -> i.precio()).sum();
	}
	
}
