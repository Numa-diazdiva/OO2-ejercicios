package oo2.ej15_EstacionMeteorologica;

public class TemperaturaCelcius extends ClimaDecorador {

	public TemperaturaCelcius(ComponenteClima componente) {
		super(componente);
	}

	public String displayData() {
		double temperaturaCelcius = this.fahrenheitACelcius(this.getTemperaturaFahrenheit());
		return " | Temperatura Celcius: " + temperaturaCelcius + super.displayData();
	}
	
}
