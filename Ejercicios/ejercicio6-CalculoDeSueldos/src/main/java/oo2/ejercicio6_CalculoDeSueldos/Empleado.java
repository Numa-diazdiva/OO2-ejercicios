package oo2.ejercicio6_CalculoDeSueldos;

public abstract class Empleado {

	private boolean estaCasado;
	private int cantHijos;
	
	public Empleado(int cantHijos, boolean estaCasado) {
		this.cantHijos = cantHijos;
		this.estaCasado = estaCasado;
	}

	public double sueldo() {
		return this.sueldoBasico() + this.sueldoAdicional() - this.descuento();
	}
	
	public double sueldoBasico() {
		return 20000;
	}

	public double sueldoAdicional() {
		double adicional;
		adicional = this.estaCasado ? 5000 : 0;
		adicional += this.cantHijos * 2000; 
		return adicional;
	}
	
	public double descuento() {
		return this.sueldoBasico() * 0.13 + this.sueldoAdicional() * 0.05;
	}
	
	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	public boolean isEstaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}
	
}
