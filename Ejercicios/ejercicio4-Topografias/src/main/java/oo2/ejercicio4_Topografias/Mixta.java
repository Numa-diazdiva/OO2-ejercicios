package oo2.ejercicio4_Topografias;

import java.util.ArrayList;
import java.util.List;

public class Mixta implements Topografia {

	private List<Topografia> children;
	
	// Por ahora no se puede instanciar sin tener todos los hijos
	public Mixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		this.children = new ArrayList<Topografia>();
		this.children.add(t1);
		this.children.add(t2);
		this.children.add(t3);
		this.children.add(t4);
	}
	
	public Mixta(List<Topografia> topografias) {
		this.children = new ArrayList<Topografia>();
		this.children.addAll(topografias);
	}
	
	public double proporcionDeAgua() {
		return this.children.stream().mapToDouble(c -> c.proporcionDeAgua()).sum() / 4;
	}
	
	public double proporcionDeTierra() {
		return 1 - this.proporcionDeAgua();
	}
	
	public boolean sonIguales(Topografia otraTopografia) {
		List<Topografia> otraChildren = otraTopografia.getChildren();
		if(otraChildren != null) {
			return otraChildren.equals(this.children);
		}
		return false;
		
	}

	public List<Topografia> getChildren() {
		return this.children;
	}
		
//	public Topografia getChildren(int pos) {
//		return this.children.get(pos);
//	}
//	
}
