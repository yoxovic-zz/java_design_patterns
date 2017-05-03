package pattern.test;

import design_pattern.ChainOfResposibility.Handler;
import design_pattern.ChainOfResposibility.HandlerOne;
import design_pattern.ChainOfResposibility.HandlerTwo;
import design_pattern.ChainOfResposibility.Request;

public class TestChainOfResp {

	public static void main(String[] args) {
		Request req1 = new Request("Negative value", -6);
		Request req2 = new Request("Positive value", 24);
		
		Handler chainHandeler = setUpChain();	
		chainHandeler.requestHandler(req2);
		chainHandeler.requestHandler(req1);
		
	}
	
	public static Handler setUpChain(){
		Handler firstHandler = new HandlerOne();
		Handler secondHandeler = new HandlerTwo();
		firstHandler.nextHandler(secondHandeler);
		
		return firstHandler;
	}

}
