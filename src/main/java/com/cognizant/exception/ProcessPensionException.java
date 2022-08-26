package com.cognizant.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter


public class ProcessPensionException extends RuntimeException{
	
	private static final long serialVersionUID = 210649836231358204L;
    private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ProcessPensionException(String message) {
		super();
		this.message = message;
	}

}
