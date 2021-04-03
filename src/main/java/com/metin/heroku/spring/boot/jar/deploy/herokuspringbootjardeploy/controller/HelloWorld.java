package com.metin.heroku.spring.boot.jar.deploy.herokuspringbootjardeploy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Metin on 18.05.2019.
 */
@RestController()
@RequestMapping("/api")
public class HelloWorld {

    String last = "";

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
    public void sayHello1(String token){
        last = token;
        System.out.printf(token);
    }

    @PostMapping("/v2/test1")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHelloPost1(String token){
        last = token;
        System.out.printf(token);
    }

    @GetMapping("/v2/test2")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHello2(Object object){
        last = object.toString();
        System.out.printf(object.toString());
    }

    @PostMapping("/v2/test2")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHelloPost2(Object object){
        last = object.toString();
        System.out.printf(object.toString());
    }

    @GetMapping("/v2/test3")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHello3(String code, String state, String error){
        last = code+state+error;
    }

    @PostMapping("/v2/test3")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHelloPost3(String code, String state, String error){
        last = code+state+error;
    }

    @GetMapping("/v2/test4")
    @ResponseStatus(value = HttpStatus.OK)
    public String sayHello4(){

        return last;
    }

}
