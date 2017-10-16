package pl.coderslab;

public class Main1 {

	public static void main(String[] args) {
		Moveable[] moveableTab = { new Car(200, "Syrena 105", "limuzyna"), new Cat(), new Person() };
		for (Moveable m : moveableTab) {
			m.start();
		}

	}

}
