package pl.coderslab.abs1;

public class Train extends Vehicle {
	private int trackWidth;

	public Train(String model, int maxSpeed, int trackWidth) {
		super(maxSpeed, model);
		this.trackWidth = trackWidth;
		
	}

	public int getTrackWidth() {
		return trackWidth;
	}

	public void setTrackWidth(int trackWidth) {
		this.trackWidth = trackWidth;
	}
}
