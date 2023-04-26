package oo2.ejercicio10_AdministradorDeProyectos;

public abstract class Etapa {

	private String nombreEtapa;
	
	public Etapa(String nombreEtapa) {
		this.nombreEtapa = nombreEtapa;
	}
	
	// abstract ?
	public void aprobarEtapa(Proyecto proyecto) {
		
	}
	
	// Hago esta especie de template, o dejo como abstracto?
	public void actualizarMargenDeGanancia(Proyecto proyecto, double margen) {
		if(this.margenValido(margen)) {
			proyecto.setMargenDeGanancia(margen);
		}
	}
	
	public boolean margenValido(double margen) {
		return false;
	}
	
	public void cancelar(Proyecto proyecto) {
		proyecto.setObjetivo("Cancelado");
		proyecto.setEtapaActual(new Cancelado());
	}

	public String getNombreEtapa() {
		return nombreEtapa;
	}
}
