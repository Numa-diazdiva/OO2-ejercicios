package oo2.ej15_EstacionMeteorologica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClimaDecoradorTest {

	private ClimaDecorador temperaturaCelcius, temperaturaFahrenheit, presion, radiacionSolar;
	private HomeWeatherStationAdapter adaptadorHomeWS;
	
	@BeforeEach
	void setUp() {
		this.adaptadorHomeWS = new HomeWeatherStationAdapter(new HomeWeatherStation());
	}
	
	@Test
	void vista1Test() {
		this.presion = new Presion(this.adaptadorHomeWS);
		this.radiacionSolar = new Radiacion(presion);
//		System.out.print(radiacionSolar.displayData());
		assertEquals(" | Radiación solar: 500.0 | Presión atmosférica: 1008.0", radiacionSolar.displayData());
	}
	
	@Test
	void vista2Test() {
		this.presion = new Presion(this.adaptadorHomeWS);
		this.radiacionSolar = new Radiacion(presion);
		this.temperaturaCelcius = new TemperaturaCelcius(radiacionSolar);
		this.temperaturaFahrenheit = new TemperaturaFahrenheit(temperaturaCelcius);
		System.out.println(temperaturaFahrenheit.displayData());
//		assertEquals(" | Radiación solar: 500.0 | Presión atmosférica: 1008.0", radiacionSolar.displayData());
	}
	
	@Test
	void vista3Test() {
		this.presion = new Presion(this.adaptadorHomeWS);
		this.radiacionSolar = new Radiacion(presion);
		this.temperaturaCelcius = new TemperaturasCelcius(radiacionSolar);
		this.temperaturaFahrenheit = new TemperaturasFahrenheit(temperaturaCelcius);
		System.out.println(temperaturaFahrenheit.displayData());
//		assertEquals(" | Radiación solar: 500.0 | Presión atmosférica: 1008.0", radiacionSolar.displayData());
	}
	
	
}
