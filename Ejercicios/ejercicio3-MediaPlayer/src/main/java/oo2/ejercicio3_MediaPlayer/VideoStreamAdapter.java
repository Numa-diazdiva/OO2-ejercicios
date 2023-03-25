package oo2.ejercicio3_MediaPlayer;

public class VideoStreamAdapter implements Media {
	private VideoStream videoStreamAdaptee;
	
	public VideoStreamAdapter() {
		this.videoStreamAdaptee = new VideoStream();
	}
	
	public void play() {
		this.videoStreamAdaptee.reproducir();
	}
	
}
