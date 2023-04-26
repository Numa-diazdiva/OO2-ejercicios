package oo2.ejercicio11_DispositivoMovil;

public class FourGConnection {

	private String symb;
	
	public FourGConnection() {
		this.symb = "4G connection set";
	}
	
	public String transmit(String data, int crc) {
		return "4G - Data: " + data + "CRC: " + crc;
	}

	public String getSymb() {
		return this.symb;
	}
	
	
}
