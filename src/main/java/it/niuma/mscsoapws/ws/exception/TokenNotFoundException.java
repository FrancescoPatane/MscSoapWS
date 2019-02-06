package it.niuma.mscsoapws.ws.exception;

public class TokenNotFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String message;
	
	
	public TokenNotFoundException(String message) {
		super();
		this.message = message;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
}
