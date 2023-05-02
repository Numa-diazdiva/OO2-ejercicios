package oo2.ejercicio10_AdministradorDeProyectos;

public abstract class Etapa {

	private String nombreEtapa;
	
	public Etapa(String nombreEtapa) {
		this.nombreEtapa = nombreEtapa;
	}
	
	// Si se repite el vacío está bueno que quede así y que las subclases que hacen algo hagan Override
	public void aprobarEtapa(Proyecto proyecto) {
		
	}
	
	/*
		Sirve el template, pero por más que no haga nada por el false del margenValido,
		pisar en cancelado y confirmado para evitar errores a futuro
	 */
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