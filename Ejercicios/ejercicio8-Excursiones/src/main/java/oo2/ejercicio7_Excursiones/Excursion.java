package oo2.ejercicio7_Excursiones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {

	private EstadoExcursion estado;
	private List<Usuario> usuarios, listaDeEspera;
	private String nombre;
	private LocalDate fechaInicio, fechaFin;
	private String puntoDeEncuentro;
	private int cupoMinimo, cupoMaximo;
	private double costo;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoDeEncuentro, int cupoMinimo, int cupoMaximo, double costo) {
		this.setEstado(new AConfirmar());
		this.usuarios = new ArrayList<Usuario>();
		this.listaDeEspera = new ArrayList<Usuario>();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.costo = costo;
	}

	// Interactuar con el estado
	public void inscribirUsuario(Usuario usr) {
		this.estado.inscribirUsuario(usr, this);
	}
	
	public List<Usuario> usuariosInscriptos() {
		return this.estado.usuariosInscriptos(this);
	}
	
	public List<Usuario> inscriptosProvisorios() {
		return this.estado.inscriptosProvisorios(this);
	}
	
	public List<Usuario> listaDeEspera() {
		return this.estado.listaDeEspera(this);
		//Acá lo delego al state pero capaz podría ser también: return this.listaDeEspera();
	}
	
	public String obtenerInformacion() {
		return this.estado.obtenerInformacion(this);
	}
	
	
	// Mensajes para que llamen los estados
	public void inscribir(Usuario usr) {
		this.usuarios.add(usr);
	}
	
	public void añadirAEspera(Usuario usr) {
		this.listaDeEspera.add(usr);
	}
	
	public void setEstado(EstadoExcursion estado) {
		this.estado = estado;
	}
	
	// No sabía si ponerlo acá o en el estado, pero se me hace que puede ser una funcionalidad útil para la clase y que puede
	// disminuir el acoplamiento el que esté acá
	// podría devolver una lista también
	public String getEmails() {
		String emails = "";
		this.usuarios.stream().map(u -> emails.concat(u.getEmail()) + " \n");
		return emails;
	}
	
	// Getters/setters usuales
	public EstadoExcursion getEstado() {
		return estado;
	}

	public List<Usuario> getInscriptos() {
		return this.usuarios;
	}
	
	public List<Usuario> getListaDeEspera() {
		return this.listaDeEspera;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getPuntoDeEncuentro() {
		return puntoDeEncuentro;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}
	
	public int getCantInscriptos() {
		return this.usuarios.size();
	}

	public double getCosto() {
		return costo;
	}

	public String getNombre() {
		return nombre;
	}

		
}
