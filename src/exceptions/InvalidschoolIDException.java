package exceptions;

public class InvalidschoolIDException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidschoolIDException(String message) {
		super(message);
	}
	
	public InvalidschoolIDException(Throwable cause) {
		super(cause);
	}
	
	public InvalidschoolIDException(String message, Throwable cause) {
		super(message, cause);
	}
}
