package com.devtalk.logback.demo.exception;

import org.springframework.http.HttpStatus;

public class HomeServiceException extends RuntimeException {
    private String title;
    private HttpStatus status;

    public HomeServiceException(String title, HttpStatus status, String message, Throwable throwable) {
        super(message, throwable);
        this.title = title;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
