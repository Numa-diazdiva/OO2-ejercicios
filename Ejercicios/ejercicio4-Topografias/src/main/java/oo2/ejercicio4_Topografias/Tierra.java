package oo2.ejercicio4_Topografias;

import java.util.List;

public class Tierra implements Topografia {

	private double cantAgua;

	public Tierra() {
		this.cantAgua = 0;
	}
	
	public double proporcionDeAgua() {
		return this.cantAgua;
	}
	
	public double proporcionDeTierra() {
		return 1 - this.proporcionDeAgua();
	}
	
	public boolean sonIguales(Topografia otraTopografia) {
		return this.proporcionDeAgua() == otraTopografia.proporcionDeAgua();
	}
	
	public List<Topografia> getChildren(){
		return null;
	}
	
}
