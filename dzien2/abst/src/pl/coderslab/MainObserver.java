package pl.coderslab;

public class MainObserver {

	public static void main(String[] args) {
		Subject subject = new Post();
		subject.attach(new FacebookObserver());
		subject.attach(new SubscriberObserver());
		subject.attach(new PublishSubscriber());
		subject.nofityObservers();
	}

}
