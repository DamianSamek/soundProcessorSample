package soundProcessor.thirdparty;

import soundProcessor.SoundTrack;

public class Delay {

	private boolean initialized;
	
	public void initialize() {
		this.initialized = true;
	}
	
	public void addDelay(SoundTrack track) {
		if (initialized) {
			track.sound += "Adding delay as in Run Like Hell";
		}
	}
}
