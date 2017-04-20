package pattern.test;

import design_pattern.Command.*;

public class TestCommand {

	public static void main(String[] args) {
		
		//Command pattern LIGHT COMMANDS testing along with the currently assigned LIGHT STATE 
		RemoteControl remote = new RemoteControl();
		Light testLight = new Light("Creating test light");
		
		LightOnCommand lightOnCommand = new LightOnCommand(testLight);
		LightOffCommand lightOffCommand = new LightOffCommand(testLight);
		
		remote.setCommand(lightOnCommand, lightOffCommand);
		//Initial test
		/*remote.pushButtonOn();
		remote.pushButtonOff();*/
		
		// Test for pushing command button LightON, twice in a row
		/*remote.pushButtonOn();
		remote.pushButtonOn();
		remote.pushButtonOff();*/
		
		// Test for pushing command button LightOFF, twice in a row
		remote.pushButtonOn();
		remote.pushButtonOff();
		remote.pushButtonOff();
		
		System.out.println(remote);
	}

}
