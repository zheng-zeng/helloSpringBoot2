package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zz
 * @Date 2019/7/29
 */
@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("hello")
    public String hello(){
        return "hello222222222";
    }
}
