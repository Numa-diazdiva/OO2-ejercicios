package oo2.ejercicio4_Topografias;

import java.util.List;
// revisar transparencia de las soluciones según el GOF	
// Tengo más que nada el comportamiento de las hojas, el composite hace override
public abstract class Topografia {
	
	
	/*
	 * Devuelve la proporción de agua del terreno
	 * */
	public abstract double proporcionDeAgua();
	
	// quzás en algún momento tengo un terreno que tiene otras proporciones locas y me conviene no implementar esto acá
	/*
	 * Devuelve la proporción de tierra del terreno
	 * */
	public abstract double proporcionDeTierra();
	
	/*
	 * Sobreescribe el método equals de Object para poder comparar Topografías según su composición
	 * */
	public boolean equals(Object o) {
		return this.equals( (Topografia) o);
	}
	
	/*
	 * Método específico de la Topografía para determinar su igualdad con otra topografía
	 * Se hereda por defecto el cálculo que hacen las hojas
	 * */
	public boolean equals(Topografia otraTopografia) {
		return this.proporcionDeAgua() == otraTopografia.proporcionDeAgua();
	}
	
	/*
	 * Método para comparar una Topografía con una Topografía mixta o compuesta
	 * Se hereda por defecto el cálculo que hacen las hojas
	 * */
	public boolean compararConMixta(Mixta otraTopografia) {
		return false;
	}
	
	
	public List<Topografia> getChildren() {
		return null;
	}
	
}