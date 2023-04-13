package oo2.ejercicio8_Excursiones;

import java.util.List;

public class Confirmada extends EstadoExcursion {

	@Override
	public void inscribirUsuario(Usuario usr, Excursion context) {
		context.inscribir(usr);
		if(context.getCupoMaximo() == context.getCantInscriptos()) {
			context.setEstado(new Completa());
		}
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
		return super.obtenerInformacion(context)
				+ "\n Emails de usuarios: " + context.getEmails()
				+ "\n Cantidad de usuarios para completar cupo máximo: " + (context.getCupoMaximo() - context.getCantInscriptos());
	}

}