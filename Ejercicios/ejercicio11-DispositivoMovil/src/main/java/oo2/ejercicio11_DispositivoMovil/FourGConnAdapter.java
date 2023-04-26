package oo2.ejercicio11_DispositivoMovil;

public class FourGConnAdapter implements Connection {

	private FourGConnection conexionAdaptada;
	
	public FourGConnAdapter() {
		this.conexionAdaptada = new FourGConnection();
	}
	
	public String sendData(String data, int crc) {
		return this.conexionAdaptada.transmit(data, crc);
	}

	public String pict() {
		return this.conexionAdaptada.getSymb();
	}
	
}
