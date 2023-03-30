package oo2.ejercicio4_Topografias;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia {

	private List<Topografia> children;
	
	public Mixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		this.children = new ArrayList<Topografia>();
		this.children.add(t1);
		this.children.add(t2);
		this.children.add(t3);
		this.children.add(t4);
	}
	
	public Mixta(List<Topografia> topografias) {
		super();
		this.children = new ArrayList<Topografia>();
		this.children.addAll(topografias);
	}
	
	
	public double proporcionDeAgua() {
		return this.children.stream().mapToDouble(c -> c.proporcionDeAgua()).sum() / 4;
	}
	
	public double proporcionDeTierra() {
		return 0;
	}
	
	// equals para sobrescribir el equals de object
	@Override
	public boolean equals(Topografia otraTopografia) {
		return otraTopografia.compararConMixta(this);
	}
	
	@Override
	public boolean compararConMixta(Mixta m) {
	     return this.children.equals(m.getChildren());
	}
	
	@Override
	public List<Topografia> getChildren() {
		return this.children;
	}

}
