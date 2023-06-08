package oo2.ejercicio19_juego;

public class Personaje {
	
	private String nombre;
	private String habilidad;
	private Armadura armadura;
	private Arma arma;
	private double vida;
	
	public Personaje() {
		this.vida = 100;
	}

	public Personaje(String nombre, String habilidad) {
		this.setNombre(nombre);
		this.setHabilidad(habilidad);
		this.vida = 100;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public void agregarArma(Arma arma) {
		this.arma = arma;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public Arma getArma() {
		return arma;
	}
	
	public double getVida() {
		return this.vida;
	}
	
	public void atacar(Personaje enemigo) {
		enemigo.recibirAtaque(this.arma);
	}
	
	public void recibirAtaque(Arma arma) {
		if(this.vida > 0) {
			this.vida -= this.armadura.calcularDanio(arma);
		}
	}
	
}
