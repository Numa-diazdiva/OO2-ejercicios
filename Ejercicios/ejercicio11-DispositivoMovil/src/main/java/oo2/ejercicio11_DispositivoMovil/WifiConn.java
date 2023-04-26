package oo2.ejercicio11_DispositivoMovil;

public class WifiConn implements Connection {

	private String pict;
	
	public WifiConn() {
		this.pict = "WifiConn set";
	}
	
	public String sendData(String data, int crc) {
		return "WifiConn - Data: " + data + "CRC: " + crc;
	}

	public String pict() {
		return this.pict;
	}
}
