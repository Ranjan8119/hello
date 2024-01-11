package com.cars24.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${admin.baseUrl}")
    String adminUrl;

    @Value("${c24.baseurl}")
    String c24Url;


    @RequestMapping("/")
    String home() {

        System.out.println(String.format("adimurl %s",adminUrl));
        System.out.println(String.format("c24Url %s",c24Url));

        return "Hello from Blue Pod Cars24!";
    }

    @RequestMapping("/public/health")
    String healthCheck() {
        return "Hello World from Blue Pod!";
    }

    @RequestMapping("/public/exception")
    void exception() throws Exception{
        throw new IndexOutOfBoundsException("");
    }
}
