package com.mustafayilmazdev.hrmsv2.core.utilities.results;

public class Error_Result extends Result {

	public Error_Result() {
		super(false);
	}

	public Error_Result(String message) {
		super(false, message);
	}

}
