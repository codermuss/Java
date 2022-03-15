package com.example.hrms.core.utilities.results.abstracts;

public abstract class Result {

    private boolean success;
    private String message;

    protected Result(boolean success) {
        this.success = success;
    }

    protected Result(boolean success, String message) {
        this(success);
        this.message = message;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }
}
