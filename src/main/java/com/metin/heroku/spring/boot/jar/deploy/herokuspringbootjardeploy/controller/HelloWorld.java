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
        last = "test Get";
        return last;
    }

    @PostMapping("/v2/test")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHelloPost(){
        last = "test Post";
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
    public void sayHelloPost3(String code, String state, String error) {
        last = code + state + error;

    }

    @GetMapping("/v2/test4")
    @ResponseStatus(value = HttpStatus.OK)
    public String sayHello4() {
        return last;
    }


    @PostMapping("/v2/test5")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHelloPost5(@RequestBody String token) {
        last = token;
        System.out.printf(token);
    }

    @GetMapping("/v2/test6")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHello6(@RequestBody Object object) {
        last = object.toString();
        System.out.printf(object.toString());
    }

    @PostMapping("/v2/test7")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHelloPost7(@RequestBody Object object) {
        last = object.toString();
        System.out.printf(object.toString());
    }

    @GetMapping("/v2/test8")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHello8(@RequestBody String code, @RequestBody String state, @RequestBody String error) {
        last = code + state + error;
    }

    @PostMapping("/v2/test9")
    @ResponseStatus(value = HttpStatus.OK)
    public void sayHelloPost9(@RequestBody String code, @RequestBody String state, @RequestBody String error) {
        last = code + state + error;
    }

}
