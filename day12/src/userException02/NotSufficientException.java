package userException02;

public class NotSufficientException extends Exception{
	NotSufficientException() { }
	
	NotSufficientException(String msg) {
		super(msg);
	}
	
}
