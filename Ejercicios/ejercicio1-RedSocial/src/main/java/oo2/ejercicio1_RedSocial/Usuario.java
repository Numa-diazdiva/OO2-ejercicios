package oo2.ejercicio1_RedSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private int limiteDeCaracteres; // capaz ésto debería ser algo provisto desde otro lado
	private List<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.setScreenName(screenName);
		this.limiteDeCaracteres = 250;
		this.tweets = new ArrayList<Tweet>();
	}

	public String getScreenName() {
		return this.screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	public List<Tweet> getTweets() {
		return this.tweets;
	}
	
	private boolean cumpleLongitud(String texto) {
		return texto.length() <= limiteDeCaracteres && texto.length() > 0; 
	}
	
	
	/*
	 * Crea un tweet con el texto especificado -si cumple con la longitud requerida- y lo agrega 
	 * a la colección de tweets del usuario.
	 * 
	 * @param texto
	 * @return nuevo Tweet si el texto cumple con la cant. de caracteres, null en caso contrario.
	 * */
	public Tweet twittear(String texto) {
		// Siento que el tweet debería ver lo de la longitud, pero por otro lado, cómo detengo la instanciación si no
		// se cumple lo que se tiene que cumplir?
		if (this.cumpleLongitud(texto)) {
			Tweet nuevoTweet = new Tweet(texto);
			this.tweets.add(nuevoTweet);
			return nuevoTweet;
		} 
		return null;
	}
	
	// Tengo algo de código muy similar acá
	public Tweet reTwittear(String texto, Tweet tweetOriginal) {
		if (this.cumpleLongitud(texto)) {
			// me gustaría reusar twittear(), pero creo que Tweet no debería tener un set de retweet
			Tweet nuevoTweet = new Tweet(texto, tweetOriginal);
			this.tweets.add(nuevoTweet);
			return nuevoTweet;
		}
		return null;
	}
	
}
