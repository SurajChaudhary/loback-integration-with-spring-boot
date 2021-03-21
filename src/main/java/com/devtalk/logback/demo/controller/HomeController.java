package com.devtalk.logback.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
//@RequiredArgsConstructor
@RestController
public class HomeController {
    private final Logger log = LoggerFactory.getLogger(HomeController.class);
    //private final HomeService homeService;


    @GetMapping("/home")
    public String home() {
        log.trace("This is a TRACE logger.....");
        log.debug("This is a DEBUG logger......");
        log.info("This is a INFO logger......");
        log.warn("This is a WARN logger......");
        log.error("This is a ERROR logger......");
        //return homeService.getHome();
        return "Welcome Home";
    }
}