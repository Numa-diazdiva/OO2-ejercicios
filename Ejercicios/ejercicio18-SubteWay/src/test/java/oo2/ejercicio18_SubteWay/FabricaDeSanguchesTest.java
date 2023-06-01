package oo2.ejercicio18_SubteWay;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FabricaDeSanguchesTest {

	private SubteWay subteWay;
	private FabricaDeSanguches clasico, vegetariano, vegano, sinTacc;
	private Sanguche sangucheTesteado;
	
	@BeforeEach
	void setUp() {
		this.subteWay = new SubteWay();
		this.clasico = new FabricaClasico();
		this.vegetariano = new FabricaVegetariano();
		this.vegano = new FabricaVegano();
		this.sinTacc = new FabricaSinTACC();
	}
	
	
	@Test
	void fabricarClasicoTest() {
		this.subteWay.setFabrica(clasico);
		this.sangucheTesteado = this.subteWay.fabricarSanguche();
		assertEquals(500, this.sangucheTesteado.precio());
	}
	
	@Test
	void fabricarVegetarianoTest() {
		this.subteWay.setFabrica(vegetariano);
		this.sangucheTesteado = this.subteWay.fabricarSanguche();
		assertEquals(420, this.sangucheTesteado.precio());
	}
	
	@Test
	void fabricarVeganoTest() {
		this.subteWay.setFabrica(vegano);
		this.sangucheTesteado = this.subteWay.fabricarSanguche();
		assertEquals(620, this.sangucheTesteado.precio());
	}
	
	@Test
	void fabricarSinTaccTest() {
		this.subteWay.setFabrica(sinTacc);
		this.sangucheTesteado = this.subteWay.fabricarSanguche();
		assertEquals(618, this.sangucheTesteado.precio());
	}
	
	
}
