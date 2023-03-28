package oo2.ejercicio4_Topografias;

import java.util.List;

public class Agua implements Topografia {
	
	private double cantAgua;

	public Agua() {
		this.cantAgua = 1;
	}
	
	public double proporcionDeAgua() {
		return this.cantAgua;
	}
	
	public double proporcionDeTierra() {
		return 1 - this.proporcionDeAgua();
	}
	
	public boolean sonIguales(Topografia otraTopografia) {
		return this.proporcionDeTierra() == otraTopografia.proporcionDeTierra();
	}
	
	public List<Topografia> getChildren(){
		return null;
	}
}
