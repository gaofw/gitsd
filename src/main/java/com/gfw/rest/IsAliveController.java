package com.gfw.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IsAliveController {

    @RequestMapping("isAlive")
    public String isAlive(){
        return "2";
    }
}
