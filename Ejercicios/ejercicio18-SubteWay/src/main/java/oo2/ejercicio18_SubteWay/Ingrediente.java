package oo2.ejercicio18_SubteWay;

public class Ingrediente {

	private String nombre;
	private double precio;
	
	public Ingrediente(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public double precio() {
		return this.precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
}
