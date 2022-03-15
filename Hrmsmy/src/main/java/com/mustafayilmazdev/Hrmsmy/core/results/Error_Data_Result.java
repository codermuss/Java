package com.mustafayilmazdev.Hrmsmy.core.results;

public class Error_Data_Result<T> extends Data_Result<T> {

	public Error_Data_Result(T data) {
		super(data, false);

	}

	public Error_Data_Result(T data, String message) {
		super(data, false, message);

	}

	public Error_Data_Result(String message) {
		super(null, false, message);

	}

	public Error_Data_Result() {
		super(null, false);

	}

}
