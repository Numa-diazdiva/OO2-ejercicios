package oo2.ej15_EstacionMeteorologica;

import java.util.List;

public interface ComponenteClima {
	
	public double getTemperaturaFahrenheit();
	
	public List<Double> getTemperaturasFahrenheit();
	
	public double getRadiacionSolar();
	
	public double getPresion();
	
	public String displayData();
	
}
