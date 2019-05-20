package com.metin.heroku.spring.boot.jar.deploy.herokuspringbootjardeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Metin on 18.05.2019.
 */

@RestController
public class HelloWorld {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World...";
    }
}
