package oo2.ejercicio6_CalculoDeSueldos;

public class EmpleadoDePlanta extends Empleado {

	public int aniosDeAntiguedad;
	
	public EmpleadoDePlanta(int cantHijos, boolean estaCasado) {
		super(cantHijos, estaCasado);
		this.aniosDeAntiguedad = 0;
	}

	public int getAniosDeAntiguedad() {
		return aniosDeAntiguedad;
	}

	public void setAniosDeAntiguedad(int aniosDeAntiguedad) {
		this.aniosDeAntiguedad = aniosDeAntiguedad;
	}
	
	public double sueldoBasico() {
		return 50000;
	}
	
	public double sueldoAdicional() {
		return super.sueldoAdicional() + this.aniosDeAntiguedad * 2000;
	}
	
}
