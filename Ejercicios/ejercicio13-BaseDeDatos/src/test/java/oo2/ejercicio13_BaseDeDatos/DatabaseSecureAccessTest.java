package oo2.ejercicio13_BaseDeDatos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseSecureAccessTest {

	private Sistema sistema;
	private DatabaseSecureAccess proxy;
	private DatabaseAccess database;
	
	@BeforeEach
	void setUp() {
		this.sistema = new Sistema();
		this.database = new DatabaseRealAccess();
		this.proxy = new DatabaseSecureAccess(database, sistema);
	}
	
	@Test
    void testGetSearchResultsOK() {
		this.sistema.agregarUsuario("Mariah");
		this.proxy.authenticate("Mariah");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
    }
	
	@Test
    void testGetSearchResultsFail() {
		this.sistema.agregarUsuario("Capoch");
		this.proxy.authenticate("Mariah");
        assertNull(this.proxy.getSearchResults("select * from comics where id=1"));
    }
	

    @Test
    void testInsertNewRowOK() {
    	this.sistema.agregarUsuario("Jefferson");
    	this.proxy.authenticate("Jefferson");
        assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));
    }
    
    @Test
    void testInsertNewRowFail() {
    	this.sistema.agregarUsuario("Matilde");
    	this.proxy.authenticate("Fredersen");
        assertEquals(0, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
    }
	
	
	
}
