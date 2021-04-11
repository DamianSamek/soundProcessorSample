package soundProcessor;
import java.util.ArrayList;
import java.util.List;

public class Processor {

	public SoundTrack track;
	
	private List<SoundEffect> effects = new ArrayList<SoundEffect>();
	
	public Processor(SoundTrack track) {
		this.track = track;
	}
	
	public void addEffect(SoundEffect effect) {
		effects.add(effect);
	}
	
	public void process() {
		effects.forEach(e -> e.apply(track));
	}
	
	public SoundTrack getTrack() {
		return track;
	}
}
