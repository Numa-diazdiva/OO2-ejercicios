package oo2.ejercicio4_Topografias;


public class Tierra extends Topografia {

	public Tierra() {
		super();
	}
	
	public double proporcionDeAgua() {
		return 0;
	}
	
	public double proporcionDeTierra() {
		return 1 - this.proporcionDeAgua();
	}
		
}