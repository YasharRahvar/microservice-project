package ca.yrhv.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/simple")
public class SimpleController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hi there";
    }
}
