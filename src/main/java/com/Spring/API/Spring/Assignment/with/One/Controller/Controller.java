package com.Spring.API.Spring.Assignment.with.One.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class Controller {
    @RequestMapping("/status")
    public static String showStatus(){
        LocalTime time=LocalTime.now();
        System.out.println("=============================================================");
        System.out.println("Running: "+ time);
        return  "Running, "+time;
    }
}