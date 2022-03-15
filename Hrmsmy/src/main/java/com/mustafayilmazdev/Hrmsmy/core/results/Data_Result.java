package com.mustafayilmazdev.Hrmsmy.core.results;

public class Data_Result<T> extends Result {
	private T data;

	public Data_Result(T data, boolean success, String message) {
		super(success, message);
		this.data = data;
	}

	public Data_Result(T data, boolean success) {
		super(success);
		this.data = data;
	}

	public T getData() {
		return this.data;
	}
}
