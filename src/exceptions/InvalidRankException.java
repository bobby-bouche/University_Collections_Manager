package exceptions;

public class InvalidRankException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2766627503117334741L;

	public InvalidRankException(String message) {
		super(message);
	}
	
	public InvalidRankException(Throwable cause) {
		super(cause);
	}
	
	public InvalidRankException(String message, Throwable cause) {
		super(message, cause);
	}

}
