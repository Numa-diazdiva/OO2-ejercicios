package oo2.ejercicio19_juego;

public abstract class FabricaPersonaje {

	public Personaje crearPersonaje() {
		Personaje nuevoPersonaje = new Personaje();
		this.setearNombre(nuevoPersonaje);
		this.agregarArma(nuevoPersonaje);
		this.agregarArmadura(nuevoPersonaje);
		this.agregarHabilidad(nuevoPersonaje);
		return nuevoPersonaje;
	}
	
	
	public abstract void setearNombre(Personaje personaje);
	
	public abstract void agregarArma(Personaje personaje);
	
	public abstract void agregarArmadura(Personaje personaje);
	
	public abstract void agregarHabilidad(Personaje personaje);
	
}
