package com.devtalk.logback.demo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class HomeExceptionHandler {


    @ExceptionHandler(HomeServiceException.class)
    public HomeServiceException handleServiceException(HomeServiceException serviceException, WebRequest request) {
        System.out.println(request);
        return serviceException;
    }
}
