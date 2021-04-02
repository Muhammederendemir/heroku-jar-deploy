package com.metin.heroku.spring.boot.jar.deploy.herokuspringbootjardeploy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Metin on 18.05.2019.
 */
@RestController()
@RequestMapping("/api")
public class HelloWorld {

    @GetMapping("/v2/test")
    @ResponseStatus(value = HttpStatus.OK)
    public String sayHello(){

        System.out.printf("Selam Anıl");
        return "test1";
    }

    @PostMapping("/v2/test")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHelloPost(){
        System.out.printf("Selam Anıl");
    }


    @GetMapping("/v2/test1")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHello(String token){
        System.out.printf(token);
    }

    @PostMapping("/v2/test1")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHelloPost(String token){
        System.out.printf(token);
    }

    @GetMapping("/v2/test2")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHello(Object object){
        System.out.printf(object.toString());
    }

    @PostMapping("/v2/test2")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHelloPost(Object object){
        System.out.printf(object.toString());
    }

}
