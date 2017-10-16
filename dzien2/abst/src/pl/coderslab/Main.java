package pl.coderslab;

public class Main {

	public static void main(String[] args) {
		Vehicle[] vehicles = { new Car(200, "Syrena 105", "limuzyna"), new Train(180, "TRWA10", 600) };

		for (Vehicle v : vehicles) {
			System.out.println(v.toString());
			v.showStartMethod();
			
			if(v instanceof Inspectionable){
				Inspectionable in = (Inspectionable) v;
				in.createInspection();
			}
		}

//		Car car = (Car) vehicles[0];
//		Train train = (Train) vehicles[1];
//		System.out.println(car.getType());
//		System.out.println(train.getTrackWidth());
//		Inspectionable in = (Inspectionable) car;
//		in.createInspection();
	}

}
