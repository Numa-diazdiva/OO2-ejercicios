package oo2.ej15_EstacionMeteorologica;

public class Radiacion extends ClimaDecorador {

	public Radiacion(ComponenteClima componente) {
		super(componente);
	}

	@Override
	public String displayData() {
		return " | Radiación solar: " + this.getRadiacionSolar() + super.displayData();
	}
	
}
