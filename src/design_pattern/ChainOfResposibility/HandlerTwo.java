package design_pattern.ChainOfResposibility;

public class HandlerTwo extends Handler {

	@Override
	public void requestHandler(Request request) {
		if (request.getValue() < 0) {
			System.out.println("Negative values are handled by HandlerTwo:");
			System.out.println("\tHandlerTwo.HandleRequest : " + request.getDescription() + " " 
								+ request.getValue());
		} else {
			if(nextHandler != null){
				nextHandler.requestHandler(request);
			}
		}
	}
}
