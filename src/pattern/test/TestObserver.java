package pattern.test;

import desing_pattern.Observer.*;

public class TestObserver {

	public static void main(String[] args) {
		
			ConcreteSubject subject = new ConcreteSubject();
			ConcreteObserver observer = new ConcreteObserver(subject);
			
			//publish new state to a registered observers
			subject.setState("New Subject state!!!");
			subject.notifyObservers();
			
			subject.removeObserver(observer);
			
			//additionally published state will not reach an observer
			subject.setState("New Subject state without Observer will not show up!!!");
			subject.notifyObservers();
	}

}
