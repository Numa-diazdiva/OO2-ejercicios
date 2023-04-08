package oo2.ejercicio7_Excursiones;

public class Usuario {

	private String nombre, apellido, email;
	
	public Usuario(String nombre, String apellido, String email) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEmail(email);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
