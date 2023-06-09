package oo2.ejercicio1_RedSocial;

public class Tweet {
	private String texto;
	private Tweet reTweet; // hace falta alguna jerarquía acá?
	
	
	public Tweet(String texto, Tweet reTweet) {
		this.texto = texto;
		this.reTweet = reTweet;
	}
	
	public Tweet(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public Tweet getReTweet() {
		// Es raro, no me cierra, pero si no tiene nada devuelve null
		return this.reTweet; 
	}
}
