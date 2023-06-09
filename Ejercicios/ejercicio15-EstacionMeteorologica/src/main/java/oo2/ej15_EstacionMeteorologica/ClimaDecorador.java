package oo2.ej15_EstacionMeteorologica;

import java.util.List;

public abstract class ClimaDecorador implements ComponenteClima {

	private ComponenteClima componente;
	
	public ClimaDecorador(ComponenteClima componente) {
		this.componente = componente;
	}
	
	@Override
	public double getTemperaturaFahrenheit() {
		return this.componente.getTemperaturaFahrenheit();
	}

	@Override
	public List<Double> getTemperaturasFahrenheit() {
		return this.componente.getTemperaturasFahrenheit();
	}

	@Override
	public double getRadiacionSolar() {
		return this.componente.getRadiacionSolar();
	}

	@Override
	public double getPresion() {
		return this.componente.getPresion();
	}

	@Override
	public String displayData() {
		return componente.displayData();
	}
	
	protected double fahrenheitACelcius(double valor) {
		return (valor - 32) / 1.8;
	}
	
	
}
