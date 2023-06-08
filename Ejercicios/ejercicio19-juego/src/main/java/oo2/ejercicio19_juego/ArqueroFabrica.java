package oo2.ejercicio19_juego;

public class ArqueroFabrica extends FabricaPersonaje {

	@Override
	public void agregarArma(Personaje personaje) {
		personaje.agregarArma(new Arco());
	}

	@Override
	public void agregarArmadura(Personaje personaje) {
		personaje.agregarArmadura(new ArmaduraDeCuero());
	}

	@Override
	public void agregarHabilidad(Personaje personaje) {
		personaje.setHabilidad("Tiro con arco");
	}

	@Override
	public void setearNombre(Personaje personaje) {
		personaje.setNombre("Arquero");
	}
	
}
