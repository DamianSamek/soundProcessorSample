package soundProcessor;

public class Distortion implements SoundEffect {

	@Override
	public void apply(SoundTrack soundtrack) {
		soundtrack.sound += "Adding distortion as in Master of Puppets";
		
	}

}
