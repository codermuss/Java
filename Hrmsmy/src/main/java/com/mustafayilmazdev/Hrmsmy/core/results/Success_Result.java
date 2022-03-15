package com.mustafayilmazdev.Hrmsmy.core.results;

public class Success_Result extends Result {

	public Success_Result() {
		super(true);
	}

	public Success_Result(String message) {
		super(true, message);
	}
}
