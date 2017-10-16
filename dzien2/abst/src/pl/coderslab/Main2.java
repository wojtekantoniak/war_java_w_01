package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String [] args){
		List<Moveable> moveableList = new ArrayList<Moveable>();
		moveableList.add(new Car(200, "Syrena 105", "limuzyna"));
		moveableList.add(new Cat());
		moveableList.add(new Person());
		for(Moveable m : moveableList){
			m.start();
		}
	}
}
