package exceptions;

public class InvalidCourseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -311931364779170572L;
	
	public InvalidCourseException(String message) {
		super(message);
	}
	
	public InvalidCourseException(Throwable cause) {
		super(cause);
	}
	
	public InvalidCourseException(String message, Throwable cause) {
		super(message, cause);
	}

}
