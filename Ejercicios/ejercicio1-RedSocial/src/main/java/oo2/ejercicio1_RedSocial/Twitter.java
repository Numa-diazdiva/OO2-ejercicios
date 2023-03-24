package oo2.ejercicio1_RedSocial;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	private boolean existeScreenName(String screenName) {
		return this.usuarios.stream().anyMatch(u -> u.getScreenName().equals(screenName));
	}
	
	public boolean agregarUsuario(Usuario usr) {
		if (this.existeScreenName(usr.getScreenName())) {
			return false;
		} else {
			this.usuarios.add(usr);
			return true;
		}
	}
	
	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}
	
}
