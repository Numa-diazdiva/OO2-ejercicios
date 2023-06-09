package oo2.ejercicio8_Excursiones;

import java.util.List;

public class AConfirmar extends EstadoExcursion {

	@Override
	public void inscribirUsuario(Usuario usr, Excursion context) {
		/*
		 * Nota de clase: se puede pedir los inscriptos al contexto y hacer el add acá, aunque ojo que
		 * hay quien diría que eso es envidia de atributos. Se genera envidia de atributos pero no se 
		 * carga tanto la clase context. Hay que elegir.
		 * */
		context.inscribir(usr);
		if(context.getCupoMinimo() == context.getCantInscriptos()) {
			context.setEstado(new Confirmada());
		}
	}

	@Override
	public List<Usuario> usuariosInscriptos(Excursion context) {
		return null;
	}

	@Override
	public List<Usuario> inscriptosProvisorios(Excursion context) {
		return context.getInscriptos();
	}

	@Override
	public String obtenerInformacion(Excursion context) {
		return super.obtenerInformacion(context) 
				+ "\n Cant de usuarios para completar cupo: " + (context.getCupoMinimo() - context.getCantInscriptos());
	}

}
