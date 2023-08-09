package com.myfuturehub.futuionsales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FutuionController {

    @GetMapping("/")
    public String home(){
        return "home.html";
    }
}
