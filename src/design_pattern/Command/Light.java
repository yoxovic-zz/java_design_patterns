package design_pattern.Command;

public class Light {

	boolean state;

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public Light(String message) {
		System.out.println(message);
		this.state = false;
	}

	public void On() {
			System.out.println("Light is ON!");
			this.state = true;
	}

	public void Off() {
			System.out.println("Light is OFF!");
			this.state = false;
	}
}
