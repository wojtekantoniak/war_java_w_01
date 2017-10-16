package pl.coderslab.abs1;

public abstract class Vehicle {
	private int maxSpeed;
	private String model;
	
	public Vehicle(int maxSpeed, String model) {
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
		return "Class : " + getClass() + ", model: " + model + ", speed: " + maxSpeed;
	}
}
