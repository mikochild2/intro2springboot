package com.themiko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    
    @RequestMapping("/")
    public String home() {
        System.out.println("Going home...");
        return "index";
    }
}