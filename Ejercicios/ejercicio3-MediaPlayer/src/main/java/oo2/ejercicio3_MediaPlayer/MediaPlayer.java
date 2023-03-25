package oo2.ejercicio3_MediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

	private List<Media> media;
	
	public MediaPlayer() {
		this.media = new ArrayList<Media>();
	}

	public List<Media> getMedia() {
		return media;
	}
	
}
