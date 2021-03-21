package com.devtalk.logback.demo.controller;

import com.devtalk.logback.demo.service.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    private final Logger log = LoggerFactory.getLogger(HomeController.class);
    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }


    @GetMapping("/home/{name}")
    public String home(@PathVariable("name") String name) {
        log.trace("This is a TRACE logger.....");
        log.debug("This is a DEBUG logger......");
        log.info("This is a INFO logger......");
        log.warn("This is a WARN logger......");
        log.error("This is a ERROR logger......");
        return homeService.getHome(name);
    }
}