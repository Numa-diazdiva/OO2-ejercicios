package oo2.ejercicio11_DispositivoMovil;

public class Dispositivo {

	private Display display;
	private Ringer ringer;
	private CRCAlgorithm algoritmoCRC;
	private Connection conexion;
	
	public Dispositivo() {
		this.display = new Display();
		this.ringer = new Ringer();
		this.algoritmoCRC = new CRC16_Calculator();
		this.conexion = new WifiConn();
	}
	
	public String send(String data) {
		return "asd";
	}
	
	public void cambiarConexion(Connection conexion) {
		
	}
	
	public void setAlgoritmoCRC(CRCAlgorithm algoritmo) {
		this.algoritmoCRC = algoritmo;
	}
	
}
