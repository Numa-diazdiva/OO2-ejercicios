package oo2.ejercicio6_CalculoDeSueldos;

public class EmpleadoPasante extends Empleado {

	private int examenesRendidos;
	
	// tiene sentido dejar esta info en la superclase?
	public EmpleadoPasante(int cantHijos, boolean estaCasado) {
		super(cantHijos, estaCasado);
		this.examenesRendidos = 0;
	}

	public int getExamenesRendidos() {
		return examenesRendidos;
	}

	public void setExamenesRendidos(int examenesRendidos) {
		this.examenesRendidos = examenesRendidos;
	}
	
	@Override
	public double sueldoAdicional() {
		return this.examenesRendidos * 2000;
	}
	
}
