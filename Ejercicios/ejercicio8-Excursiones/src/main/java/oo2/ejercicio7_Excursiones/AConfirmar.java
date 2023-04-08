package oo2.ejercicio7_Excursiones;

import java.util.List;

public class AConfirmar extends EstadoExcursion {

	@Override
	public void inscribirUsuario(Usuario usr, Excursion context) {
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
	public List<Usuario> listaDeEspera(Excursion context) {
		return null;
	}

	@Override
	public String obtenerInformacion(Excursion context) {
		return super.obtenerInformacion(context) 
				+ "\n Cant de usuarios para completar cupo: " + (context.getCupoMinimo() - context.getCantInscriptos());
	}

}
