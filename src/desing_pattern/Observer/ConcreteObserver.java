package desing_pattern.Observer;

public class ConcreteObserver implements IObserver{
	private ConcreteSubject sub;
	
	public ConcreteObserver(ConcreteSubject sub){
		this.sub = sub;
		sub.registerObserver(this);
		
	}
	
	public void display() {
		System.out.println("ConcreteObserver got notified! With ConcreteSubject state data:" + sub.getState());
	}
	
	@Override
	public void update() {
		display();
		
	}
	

	

}
