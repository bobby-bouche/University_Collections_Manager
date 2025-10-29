package exceptions;

public class RecordManagementException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8424003641035117799L;

	public RecordManagementException(String message) {
		super(message);
	}
	
	public RecordManagementException(Throwable cause) {
		super(cause);
	}
	
	public RecordManagementException(String message, Throwable cause) {
		super(message, cause);
	}

}
