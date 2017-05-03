package design_pattern.ChainOfResposibility;

public abstract class Handler {
	Handler nextHandler;
	
	public void nextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	};

	public abstract void requestHandler(Request request);

}
