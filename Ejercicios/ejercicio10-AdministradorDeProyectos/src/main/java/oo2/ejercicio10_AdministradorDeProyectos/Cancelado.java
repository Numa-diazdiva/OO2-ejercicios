package oo2.ejercicio10_AdministradorDeProyectos;

/*
 * Null object para representar el estado "Cancelado"
 * */
public class Cancelado extends Etapa {

	public Cancelado() {
		super("Cancelado");
	}

	@Override
	public void cancelar(Proyecto proyecto) {
		
	}
	
}
