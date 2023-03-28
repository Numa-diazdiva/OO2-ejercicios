package oo2.ejercicio4_Topografias;

import java.util.List;

public class Pantano implements Topografia {

	public Pantano() {}
	
	public double proporcionDeAgua() {
		return 0.7;
	}
	
	public double proporcionDeTierra() {
		return 0.3;
	}
	
	public boolean sonIguales(Topografia otraTopografia) {
		return this.proporcionDeAgua() == otraTopografia.proporcionDeAgua();
	}
	
	public List<Topografia> getChildren(){
		return null;
	}
	
}
