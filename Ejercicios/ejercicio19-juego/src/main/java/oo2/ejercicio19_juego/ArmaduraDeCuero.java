package oo2.ejercicio19_juego;

public class ArmaduraDeCuero extends Armadura {

	@Override
	public double calcularDanio(Arma arma) {
		return arma.danioArmaduraDeCuero();
	}

}
