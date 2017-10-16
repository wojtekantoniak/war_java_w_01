package pl.coderslab;

public class Car extends Vehicle implements Inspectionable, Moveable {
	private String type;

	public void start() {
		System.out.println("samochód jedzie");
	}

	public Car(int maxSpeed, String model, String type) {
		super(maxSpeed, model);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void createInspection() {
		System.out.println("Model: " + super.getModel() + " - sprawdzony");
	}

	@Override
	public void stop() {
		System.out.println("samochód jedzie");
	}

}
