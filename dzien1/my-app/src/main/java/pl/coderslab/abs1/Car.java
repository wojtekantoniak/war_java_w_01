package pl.coderslab.abs1;

public class Car extends Vehicle {
	private String type;
	
	public Car(String model, int maxSpeed, String type) {
		super(maxSpeed,model);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
