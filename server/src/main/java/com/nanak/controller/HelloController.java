package com.nanak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: nanak
 * @CreateTime: 2024-09-29
 * @Description: HelloController
 * @Version: 1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }
}
