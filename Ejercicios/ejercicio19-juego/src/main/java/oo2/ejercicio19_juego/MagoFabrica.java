package oo2.ejercicio19_juego;

public class MagoFabrica extends FabricaPersonaje {

	@Override
	public void agregarArma(Personaje personaje) {
		personaje.agregarArma(new Baston());
	}

	@Override
	public void agregarArmadura(Personaje personaje) {
		personaje.agregarArmadura(new ArmaduraDeCuero());
	}

	@Override
	public void agregarHabilidad(Personaje personaje) {
		personaje.setHabilidad("Magia, combate a distancia");
	}

	@Override
	public void setearNombre(Personaje personaje) {
		personaje.setNombre("Mago");
	}
	
}
