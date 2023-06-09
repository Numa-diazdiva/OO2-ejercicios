package oo2.ej15_EstacionMeteorologica;

public class Presion extends ClimaDecorador {

	public Presion(ComponenteClima componente) {
		super(componente);
	}
	
	public String displayData() {
		return " | Presión atmosférica: " + this.getPresion() + super.displayData(); 
	}

}
