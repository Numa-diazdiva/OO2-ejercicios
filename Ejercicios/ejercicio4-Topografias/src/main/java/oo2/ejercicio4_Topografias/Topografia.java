package oo2.ejercicio4_Topografias;

import java.util.List;

// Siempre como interfaz?

public interface Topografia {
	// Solución menos transparente según GOF
	public double proporcionDeAgua();
	
	public double proporcionDeTierra();
	
	// Tiene sentido hacerla más transparente y definir un montón de cosas en clase abstracta?
	// herencia que no se quiere luego
	
	// Ver referencias a padres que dicen ser útiles.
	
	public boolean sonIguales(Topografia otraTopografia);
	
	// Se me ocurre esto para no preguntar por las clases, aunque las hojas no lo requieren
	public List<Topografia> getChildren();
	
}
