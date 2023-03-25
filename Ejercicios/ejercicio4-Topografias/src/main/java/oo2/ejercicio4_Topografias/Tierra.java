package oo2.ejercicio4_Topografias;

public class Tierra implements Topografia {

	private double cantAgua;

	public Tierra() {
		this.cantAgua = 0;
	}
	
	public double proporcionDeAgua() {
		return this.cantAgua;
	}
	
}
