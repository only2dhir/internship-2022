package com.devglan.exception;

public class NotFoundException extends RuntimeException {

    private int status;
    private String message;


    public NotFoundException(int status, String message) {
        super(message);
        this.status = status;
        this.message = message;
    }
}
