package oo2.ejercicio10_AdministradorDeProyectos;

/*
 * Null object para representar el estado "Cancelado"
 * (no es null object!!)
 * */
public class Cancelado extends Etapa {

	public Cancelado() {
		super("Cancelado");
	}
	
	@Override
	public void actualizarMargenDeGanancia(Proyecto proyecto, double margen) {
		
	}
	
	@Override
	public void cancelar(Proyecto proyecto) {
		
	}
	
}