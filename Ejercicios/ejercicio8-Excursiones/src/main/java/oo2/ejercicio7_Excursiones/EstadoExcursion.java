package oo2.ejercicio7_Excursiones;

import java.util.List;

public abstract class EstadoExcursion {

	public abstract void inscribirUsuario(Usuario usr, Excursion context);
	
	public abstract List<Usuario> usuariosInscriptos(Excursion context);
	
	public abstract List<Usuario> inscriptosProvisorios(Excursion context);
	
	public abstract List<Usuario> listaDeEspera(Excursion context);
	
	public String obtenerInformacion(Excursion context) {
		return " Nombre: " + context.getNombre() + "\n Costo: " + context.getCosto()
		+ "\n Fecha de inicio: " + context.getFechaInicio().toString()
		+ "\n Fecha de fin: " + context.getFechaFin().toString()
		+ "\n Punto de encuentro: " + context.getPuntoDeEncuentro();		
	}
	
}
