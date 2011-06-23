package exceptions;

public class NotEntityException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4036456090364629732L;

	
	public NotEntityException(Class notEntityClass) {
		super(notEntityClass.toString()+" is not JPA entity");
	}
}
