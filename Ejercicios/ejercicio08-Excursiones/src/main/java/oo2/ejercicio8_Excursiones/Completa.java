package oo2.ejercicio8_Excursiones;

import java.util.List;

public class Completa extends EstadoExcursion {

	@Override
	public void inscribirUsuario(Usuario usr, Excursion context) {
		context.añadirAEspera(usr);
	}

	@Override
	public List<Usuario> usuariosInscriptos(Excursion context) {
		return context.getInscriptos();
	}

	@Override
	public List<Usuario> inscriptosProvisorios(Excursion context) {
		return null;
	}

	@Override
	public String obtenerInformacion(Excursion context) {
		return super.obtenerInformacion(context);
	}

}
