package mna.a4.microservices.general.notification.otp.common.exception;

import java.io.Serializable;

public class AppException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AppException() {
		super();
	}

	public AppException(String msg) {
		super(msg);
	}

	public AppException(String msg, Exception e)  {
		super(msg, e);
	}
}
