package net.kmdm1980.aboutkmdm.exception;

public class TitleNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2696454986022401371L;

	public TitleNotFoundException(Long id) {
		super("Title not found with ID: " + id);
	}
}
