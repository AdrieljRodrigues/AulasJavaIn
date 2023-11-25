package model.exception;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) { //permite instaciar a exceção personalizada enviando uma mensagm
		super(msg);
	}
}
