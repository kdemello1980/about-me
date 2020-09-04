package net.kmdm1980.aboutkmdm.exception;

public class ItemNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6918478309313620095L;

	public ItemNotFoundException(Long id) {
		super("Item not found for ID: " + id);
	}
}
