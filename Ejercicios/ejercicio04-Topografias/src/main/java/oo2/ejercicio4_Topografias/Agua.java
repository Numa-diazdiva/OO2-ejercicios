package oo2.ejercicio4_Topografias;

public class Agua extends Topografia {

	public Agua() {
		super();
	}
	
	public double proporcionDeAgua() {
		return 1;
	}
	
	public double proporcionDeTierra() {
		return 1 - this.proporcionDeAgua();
	}
	
}