package com.fintechpath.traning.TestingApp.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
@RequestMapping(value = "/")
    public String greeting(){
        return "Hello in SpringBoot";
    }
@GetMapping(value = "/{name}")
    public String greetingWithName(@PathVariable String name){
        return String.format("Hello %s in the project",name);
    }
}
