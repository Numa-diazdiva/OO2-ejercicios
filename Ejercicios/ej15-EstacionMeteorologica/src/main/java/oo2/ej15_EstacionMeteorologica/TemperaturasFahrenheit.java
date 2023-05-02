package oo2.ej15_EstacionMeteorologica;

public class TemperaturasFahrenheit extends ClimaDecorador {

	public TemperaturasFahrenheit(ComponenteClima componente) {
		super(componente);
	}

	public String displayData() {
		return " | Temperaturas medidas (Fahrenheit): " + this.getTemperaturasFahrenheit().toString() + super.displayData(); 
	}
}
