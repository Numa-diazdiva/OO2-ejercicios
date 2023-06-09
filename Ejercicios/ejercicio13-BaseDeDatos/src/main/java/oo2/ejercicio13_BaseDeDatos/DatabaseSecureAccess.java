package oo2.ejercicio13_BaseDeDatos;

import java.util.Collection;
import java.util.List;

public class DatabaseSecureAccess implements DatabaseAccess {

	private DatabaseAccess baseDeDatos;
	private boolean isAuthenticated;
	private Sistema sistema;
	
	public DatabaseSecureAccess(DatabaseAccess baseDeDatos, Sistema sistema) {
		this.baseDeDatos = baseDeDatos;
		this.sistema = sistema;
		this.isAuthenticated = false;
	}
	
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(this.isAuthenticated) {
			return this.baseDeDatos.getSearchResults(queryString);
		}
		return null;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(this.isAuthenticated) {
			return this.baseDeDatos.insertNewRow(rowData);
		}
		return 0;
	}

	public void authenticate(String user) {
		if(this.sistema.usuarioValido(user)) {
			this.isAuthenticated = true;
		}
	}
	

}
