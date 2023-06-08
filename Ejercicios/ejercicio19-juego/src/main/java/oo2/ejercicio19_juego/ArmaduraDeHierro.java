package oo2.ejercicio19_juego;

public class ArmaduraDeHierro extends Armadura {

	@Override
	public double calcularDanio(Arma arma) {
		return arma.danioArmaduraDeHierro();
	}

}
