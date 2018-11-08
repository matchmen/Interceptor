package com.lqm.demo.controller;


import com.lqm.demo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lqm")
public class HelloWorld {


    @PostMapping("/helloWorld")
    public String helloWorld(@RequestBody User user){

        System.out.println(user.getAge());

        return "hello world !";
    }
}
