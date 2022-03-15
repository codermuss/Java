package com.mustafayilmazdev.Hrmsmy.core.results;

public class Success_Data_Result<T> extends Data_Result<T> {

	public Success_Data_Result(T data) {
		super(data, true);
	}

	public Success_Data_Result(T data, String message) {
		super(data, true, message);
	}

	public Success_Data_Result(String message) {
		super(null, true, message);
	}

	public Success_Data_Result() {
		super(null, true);
	}

}
