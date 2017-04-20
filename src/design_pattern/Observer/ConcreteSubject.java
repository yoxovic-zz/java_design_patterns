package design_pattern.Observer;

import java.util.ArrayList;

public class ConcreteSubject implements ISubject {
	private ArrayList<IObserver> observers;
	private String state; 

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ConcreteSubject() {
		this.observers = new ArrayList<IObserver>();
	}

	@Override
	public void registerObserver(IObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {

		int index = observers.indexOf(o);

		if (index >= 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			IObserver observer = (IObserver) observers.get(i);
			observer.update();
		}
	}

}
