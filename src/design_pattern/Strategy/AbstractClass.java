package design_pattern.Strategy;

public abstract class AbstractClass {
	IAlgorithmClass ab;

	public void setBehavior(IAlgorithmClass ab) {
		this.ab = ab;
	}

	public void performBehavior() {
		ab.display();
	}
}
