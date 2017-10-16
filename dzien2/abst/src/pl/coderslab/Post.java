package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

public class Post implements Subject {

	private List<Observer> observers;

	public Post() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void dettach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void nofityObservers() {
		for (Observer o : observers) {
			o.update();
		}
	}

}
