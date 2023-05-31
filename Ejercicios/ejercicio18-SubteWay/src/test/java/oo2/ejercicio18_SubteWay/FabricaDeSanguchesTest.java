package oo2.ejercicio18_SubteWay;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FabricaDeSanguchesTest {

	private FabricaDeSanguches clasico, vegetariano, vegano, sinTacc;
	private Sanguche sangucheTesteado;
	
	@BeforeEach
	void setUp() {
		this.clasico = new FabricaClasico();
		this.vegetariano = new FabricaVegetariano();
		this.vegano = new FabricaVegano();
		this.sinTacc = new FabricaSinTACC();
	}
	
	
	@Test
	void fabricarClasicoTest() {
		this.sangucheTesteado = this.clasico.fabricarSanguche();
		assertEquals(500, this.sangucheTesteado.precio());
	}
	
	@Test
	void fabricarVegetarianoTest() {
		this.sangucheTesteado = this.vegetariano.fabricarSanguche();
		assertEquals(420, this.sangucheTesteado.precio());
	}
	
	@Test
	void fabricarVeganoTest() {
		this.sangucheTesteado = this.vegano.fabricarSanguche();
		assertEquals(620, this.sangucheTesteado.precio());
	}
	
	@Test
	void fabricarSinTaccTest() {
		this.sangucheTesteado = this.sinTacc.fabricarSanguche();
		assertEquals(618, this.sangucheTesteado.precio());
	}
	
	
}
