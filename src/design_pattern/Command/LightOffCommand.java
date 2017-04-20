package design_pattern.Command;

public class LightOffCommand implements Command {

	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		if (light.isState()) {
			light.Off();
			light.setState(false);
		} else {
			System.out.println("Light is currently OFF!");
		}
	}
}
