package com.devtalk.logback.demo.service;

import com.devtalk.logback.demo.exception.HomeServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


@Service
public class HomeService {
    private final Logger log = LoggerFactory.getLogger(HomeService.class);

    public String getHome(String name) {
        log.trace("This is a TRACE logger.....");
        log.debug("This is a DEBUG logger......");
        log.info("This is a INFO logger......");
        log.warn("This is a WARN logger......");
        log.error("This is a ERROR logger......");
        if ("myHome".equalsIgnoreCase(name)) {
            throw new HomeServiceException("SERVICE_EXCEPTION", HttpStatus.NOT_FOUND, "This is a test message", null);
        }
        return "Welcome Home";
    }
}
