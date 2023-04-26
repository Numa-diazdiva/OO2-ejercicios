package oo2.ejercicio10_AdministradorDeProyectos;

public class EnConstruccion extends Etapa {
	
	public EnConstruccion() {
		super("En construcción");
	}

	@Override
	public void aprobarEtapa(Proyecto proyecto) {
		if(proyecto.precio() != 0) {
			proyecto.setEtapaActual(new EnEvaluacion());
		} else {
			throw new RuntimeException("Error: El proyecto tiene un precio de 0.");
		}
	}
	
	@Override
	public boolean margenValido(double margen) {
		// uso comparators para esto?
		return margen >= 8 && margen <= 10;
	}
	
}
