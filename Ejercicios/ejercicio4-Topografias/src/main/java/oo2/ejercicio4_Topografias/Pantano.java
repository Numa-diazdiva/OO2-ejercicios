package oo2.ejercicio4_Topografias;

public class Pantano extends Topografia {

	public Pantano() {
		super();
	}
	
	public double proporcionDeAgua() {
		return 0.7;
	}
	
	public double proporcionDeTierra() {
		return 1 - this.proporcionDeAgua();
	}
	
}