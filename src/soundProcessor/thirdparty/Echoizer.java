package soundProcessor.thirdparty;

import java.util.Collections;

import soundProcessor.SoundTrack;

public class Echoizer {

	private int echoLevel;
	
	public Echoizer(int echoLevel) {
		this.echoLevel = echoLevel;
	}
	
	public void Echoize(SoundTrack track) {
		track.sound += String.format("Adding %s", String.join(" ",  Collections.nCopies(echoLevel, "echo")));
	}
}
