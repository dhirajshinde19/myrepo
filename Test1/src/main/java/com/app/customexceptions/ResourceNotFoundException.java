package com.app.customexceptions;

public class ResourceNotFoundException extends RuntimeException {
	public ResourceNotFoundException(String errmsg) {
		super(errmsg);
	}
}
