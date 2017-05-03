package design_pattern.ChainOfResposibility;

public class HandlerOne extends Handler {
	
	@Override
	public void requestHandler(Request request) {
		if (request.getValue() > 0) {
			System.out.println("Positive values are handled by HandlerOne:");
			System.out.println("\tHandlerOne.HandleRequest : " + request.getDescription() + " " 
								+ request.getValue());
		} else {
			if(nextHandler != null){
				nextHandler.requestHandler(request);
			}
		}
	}
}
