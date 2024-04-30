package com.yuvas.CustomerManagement.Service;

public class DuplicateDataException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateDataException(String message) {
        super(message);
    }
}