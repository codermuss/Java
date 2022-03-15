package com.mustafayilmazdev.Hrmsmy.core.results;

public class Error_Result extends Result {

	public Error_Result() {
		super(false);
	}

	public Error_Result(String message) {
		super(false, message);
	}

}
