package oo2.ej15_EstacionMeteorologica;

import java.util.List;

public class HomeWeatherStationAdapter implements ComponenteClima {

	private HomeWeatherStation estacionAdaptada;
	
	public HomeWeatherStationAdapter(HomeWeatherStation estacion) {
		this.estacionAdaptada = estacion;
	}
	
	@Override
	public double getTemperaturaFahrenheit() {
		return this.estacionAdaptada.getTemperaturaFahrenheit();
	}

	@Override
	public List<Double> getTemperaturasFahrenheit() {
		return this.estacionAdaptada.getTemperaturasFahrenheit();
	}

	@Override
	public double getRadiacionSolar() {
		return this.estacionAdaptada.getRadiacionSolar();
	}

	@Override
	public double getPresion() {
		return this.estacionAdaptada.getPresion();
	}

	@Override
	public String displayData() {
		return "";
	}

}
