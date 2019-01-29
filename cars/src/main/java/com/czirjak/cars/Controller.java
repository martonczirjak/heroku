package com.czirjak.cars;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String hello() {
        return "Hello my deployed Spring App!!";
    }
}
