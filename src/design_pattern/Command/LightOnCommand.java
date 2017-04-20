package design_pattern.Command;

public class LightOnCommand implements Command {
	
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
		
	}
	
	public LightOnCommand() {
	}

	@Override
	public void execute() {
		if (!light.isState()) {
			light.On();
			light.setState(true);
		}
		else {
			System.out.println("Light is currently ON");
		}
		
	}

}
