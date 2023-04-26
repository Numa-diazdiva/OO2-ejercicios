package oo2.ejercicio10_AdministradorDeProyectos;

import java.time.LocalDate;
import java.time.Period;

public class Proyecto {

	private LocalDate fechaDeInicio, fechaDeFin;
	private String objetivo;
	private int numeroDeIntegrantes;
	private double montoCobradoPorIntegrante, margenDeGanancia;
	private Etapa etapaActual;
	
	public Proyecto(LocalDate fechaDeInicio, LocalDate fechaDeFin, String objetivo, int numeroDeIntegrantes,
			double montoCobradoPorIntegrante, double margenDeGanancia) {
		
		this.fechaDeInicio = fechaDeInicio;
		this.fechaDeFin = fechaDeFin;
		this.objetivo = objetivo;
		this.setNumeroDeIntegrantes(numeroDeIntegrantes);
		this.montoCobradoPorIntegrante = montoCobradoPorIntegrante;
		this.margenDeGanancia = margenDeGanancia;
		this.etapaActual = new EnConstruccion();
	}

	public LocalDate getFechaDeInicio() {
		return fechaDeInicio;
	}

	public void setFechaDeInicio(LocalDate fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}

	public LocalDate getFechaDeFin() {
		return fechaDeFin;
	}

	public void setFechaDeFin(LocalDate fechaDeFin) {
		this.fechaDeFin = fechaDeFin;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public double getMontoCobradoPorIntegrante() {
		return montoCobradoPorIntegrante;
	}

	public void setMontoCobradoPorIntegrante(double montoCobradoPorIntegrante) {
		this.montoCobradoPorIntegrante = montoCobradoPorIntegrante;
	}

	public double getMargenDeGanancia() {
		return margenDeGanancia;
	}

	public void setMargenDeGanancia(double margenDeGanancia) {
		this.margenDeGanancia = margenDeGanancia;
	}

	public int getNumeroDeIntegrantes() {
		return numeroDeIntegrantes;
	}

	public void setNumeroDeIntegrantes(int numeroDeIntegrantes) {
		this.numeroDeIntegrantes = numeroDeIntegrantes;
	}

	public Etapa getEtapaActual() {
		return etapaActual;
	}

	public void setEtapaActual(Etapa etapaActual) {
		this.etapaActual = etapaActual;
	}
	
	public int duracionTotal() {
		return Period.between(fechaDeInicio, fechaDeFin).getDays();
	}
	
	public double costo() {
		return this.duracionTotal() * this.montoCobradoPorIntegrante * this.numeroDeIntegrantes;
	}
	
	public double precio() {	
		return this.costo() * (1 + (this.margenDeGanancia / 100));
	}
	
	public void aprobarEtapa() {
		this.etapaActual.aprobarEtapa(this);
	}
	
	public void actualizarMargenDeGanancia(double margen) {
		this.etapaActual.actualizarMargenDeGanancia(this, margen);
	}
	
	public void cancelar() {
		this.etapaActual.cancelar(this);
	}
	
}
