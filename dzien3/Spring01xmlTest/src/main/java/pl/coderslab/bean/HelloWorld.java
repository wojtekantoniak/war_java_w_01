package pl.coderslab.bean;

public class HelloWorld {
	public HelloWorld() {
	}

	public HelloWorld(String message) {
		this.message = message;
	}

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
}
