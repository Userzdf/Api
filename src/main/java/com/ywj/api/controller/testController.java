package com.ywj.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class testController {

    @GetMapping("/test")
    @ResponseBody
    public String sum(String a, String b){
        a = "hello";
        b = "world";
        return a+b;
    }
}
