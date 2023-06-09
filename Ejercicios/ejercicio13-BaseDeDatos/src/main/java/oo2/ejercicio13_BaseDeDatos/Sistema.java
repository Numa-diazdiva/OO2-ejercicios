package oo2.ejercicio13_BaseDeDatos;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

	private List<String> users;
	
	public Sistema() {
		this.users = new ArrayList<String>();
	}
	
	public boolean usuarioValido(String nombreDeUsuario) {
		return this.users.contains(nombreDeUsuario);
	}
	
	public void agregarUsuario(String nombreDeUsuario) {
		this.users.add(nombreDeUsuario);
	}
	
}
