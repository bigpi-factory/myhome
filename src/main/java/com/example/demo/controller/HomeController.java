package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String hello(){
    	System.out.println("get mapping hello;;;");
        return "hello";
    }
   
    @GetMapping("/view")
    public String view(){
    	System.out.println("get mapping view;;;");
        return "view/view";
    }
    
    @GetMapping("/board")
    public String board(){
    	System.out.println("get mapping list;;;");
        return "board/list";
    }
}
