package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TestController {
    @RequestMapping()
    public String index(){
        return "index";
    }
}
