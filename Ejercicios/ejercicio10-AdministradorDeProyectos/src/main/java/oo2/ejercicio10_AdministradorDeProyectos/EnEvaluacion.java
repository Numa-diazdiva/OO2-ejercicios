package oo2.ejercicio10_AdministradorDeProyectos;

public class EnEvaluacion extends Etapa {

	public EnEvaluacion() {
		super("En evaluación");
	}
	
	@Override
	public void aprobarEtapa(Proyecto proyecto) {
		proyecto.setEtapaActual(new Confirmado());
	}
	
	@Override
	public boolean margenValido(double margen) {
		// uso comparators para esto?
		return margen >= 11 && margen <= 15;
	}	
}
