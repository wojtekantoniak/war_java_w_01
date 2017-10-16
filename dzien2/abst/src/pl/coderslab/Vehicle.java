package pl.coderslab;

public abstract class Vehicle {
	private int maxSpeed;
	private String model;

	public abstract void start();

	public void showStartMethod() {
		start();
	}

	public Vehicle(int maxSpeed, String model) {
		super();
		this.maxSpeed = maxSpeed;
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Class : " + this.getClass().getName() + ", model: " + getModel() + ", speed: " + getMaxSpeed();
	}

}
