package net.kmdm1980.aboutkmdm.exception;

public class EmployerNotFoundException extends RuntimeException {

	public EmployerNotFoundException(Long id) {
		super("Could not find employer ID: " + id);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3379501259187377161L;

}
