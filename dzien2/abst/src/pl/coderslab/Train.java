package pl.coderslab;

public class Train extends Vehicle implements Inspectionable {
	private int trackWidth;

	public void start() {
		System.out.println("nasypanie węgla do paleniska");
	}

	public Train(int maxSpeed, String model, int trackWidth) {
		super(maxSpeed, model);
		this.trackWidth = trackWidth;
	}

	public int getTrackWidth() {
		return trackWidth;
	}

	public void setTrackWidth(int trackWidth) {
		this.trackWidth = trackWidth;
	}

	public void createInspection() {
		System.out.println("Model: " + super.getModel() + " - sprawdzony, " + "a jaki ma rozstaw kol" + trackWidth);
	}
}
