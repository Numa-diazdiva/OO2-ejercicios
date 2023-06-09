package oo2.ej15_EstacionMeteorologica;

import java.util.List;

public class TemperaturasCelcius extends ClimaDecorador {

	public TemperaturasCelcius(ComponenteClima componente) {
		super(componente);
	}

	
	
	public String displayData() {
		List<Double> tempCelcius = this.getTemperaturasFahrenheit().stream().map(t -> this.fahrenheitACelcius(t)).toList();
		return " | Temperaturas medidas (Celcius): " + tempCelcius.toString() + super.displayData();
	}
	
}
