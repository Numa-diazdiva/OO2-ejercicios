package oo2.ejercicio6_CalculoDeSueldos;

public class EmpleadoTemporario extends Empleado {

	private int horasDeTrabajo;
	
	public EmpleadoTemporario(int cantHijos, boolean estaCasado) {
		super(cantHijos, estaCasado);
		this.horasDeTrabajo = 0;
	}
	
	public void setHorasDeTrabajo(int horasDeTrabajo) {
		this.horasDeTrabajo = horasDeTrabajo;
	}
	
	public int getHorasDeTrabajo() {
		return horasDeTrabajo;
	}
	
	@Override
	public double sueldoBasico() {
		return super.sueldoBasico() + this.horasDeTrabajo * 300;
	}
	
}
