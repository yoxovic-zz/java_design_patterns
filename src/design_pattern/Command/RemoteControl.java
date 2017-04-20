package design_pattern.Command;

public class RemoteControl {
	
	Command commandOn;
	Command commandOff;
	
	public void setCommand(Command commandOn, Command commandOff){
		this.commandOn = commandOn;
		this.commandOff = commandOff;
	}
	
	public void pushButtonOn(){
		commandOn.execute();
	}
	
	public void pushButtonOff(){
		commandOff.execute();
	}
	
	@Override
	public String toString() {
		
		StringBuffer strbuff = new StringBuffer();
		strbuff.append("\n" + commandOn.getClass().getName());
		strbuff.append("\n" + commandOff.getClass().getName());
		return strbuff.toString();
	}
}
