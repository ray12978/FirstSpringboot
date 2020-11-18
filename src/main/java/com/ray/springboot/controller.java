package com.ray.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping("/")
    String home() {return "home";}

    @RequestMapping("/test")
    public String test(){return "test";}

}
