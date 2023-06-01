package oo2.ejercicio18_SubteWay;

public class SubteWay {
	
	private FabricaDeSanguches fabrica;
	
	public SubteWay() {
		this.fabrica = new FabricaVegetariano();
	}
	
	
	public void setFabrica(FabricaDeSanguches fabrica) {
		this.fabrica = fabrica;
	}
	
	
	public Sanguche fabricarSanguche() {
		this.fabrica.iniciarCreacion();
		this.fabrica.agregarPan();
		this.fabrica.agregarAderezo();
		this.fabrica.agregarPrincipal();
		this.fabrica.agregarAdicional();
		return this.fabrica.obtenerProducto();
	}
	
}
