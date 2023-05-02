package oo2.ej15_EstacionMeteorologica;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation {

	public double getTemperaturaFahrenheit() {
		return 20;
	}
	
	public List<Double> getTemperaturasFahrenheit(){
		List<Double> nueva = new ArrayList<Double>();
		nueva.add((double) 12);
		nueva.add((double) 50);
		nueva.add((double) 20);
		return nueva;
	}
	
	public double getRadiacionSolar() {
		return 500;
	}
	
	public double getPresion() {
		return 1008;
	}
	
}
