package oo2.ejercicio4_Topografias;

public class Agua implements Topografia {
	
	private double cantAgua;

	public Agua() {
		this.cantAgua = 1;
	}
	
	public double proporcionDeAgua() {
		return this.cantAgua;
	}
}
