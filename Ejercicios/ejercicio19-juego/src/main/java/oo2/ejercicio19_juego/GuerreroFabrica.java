package oo2.ejercicio19_juego;

public class GuerreroFabrica extends FabricaPersonaje {

	@Override
	public void agregarArma(Personaje personaje) {
		personaje.agregarArma(new Espada());
	}

	@Override
	public void agregarArmadura(Personaje personaje) {
		personaje.agregarArmadura(new ArmaduraDeAcero());
	}

	@Override
	public void agregarHabilidad(Personaje personaje) {
		personaje.setHabilidad("Combate cuerpo a cuerpo");
	}

	@Override
	public void setearNombre(Personaje personaje) {
		personaje.setNombre("Guerrero");
	}
	
}
