package exception;


public class BadExpressionException extends Exception {// Exception == checked,  oder RuntimeException == unchecked
	
	public BadExpressionException() {}

	public BadExpressionException(String message) {
		super(message);
	} 
	
}
