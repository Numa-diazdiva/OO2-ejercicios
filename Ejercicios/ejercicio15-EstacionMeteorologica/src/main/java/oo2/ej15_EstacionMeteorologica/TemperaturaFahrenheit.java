package oo2.ej15_EstacionMeteorologica;

public class TemperaturaFahrenheit extends ClimaDecorador {

	public TemperaturaFahrenheit(ComponenteClima componente) {
		super(componente);
	}

	@Override
	public String displayData() {
		return " | Temperatura Fahrenheit: " + this.getTemperaturaFahrenheit() + super.displayData();
	}
		
}
