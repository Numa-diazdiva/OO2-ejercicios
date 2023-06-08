package oo2.ejercicio19_juego;

public class Juego {

	private FabricaPersonaje fabricaPersonajes;
	
	public Juego() {
		this.fabricaPersonajes = new ArqueroFabrica();
	}
	
	public Personaje crearPersonaje() {
		return this.fabricaPersonajes.crearPersonaje();
	}
	
	public void setFabricaPersonajes(FabricaPersonaje fabrica) {
		this.fabricaPersonajes = fabrica;
	}
	
}
