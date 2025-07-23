package com.oracle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/sayHello.do")
    public String sayHello() {
        return "Hello";  // Maps to /WEB-INF/views/hello.jsp
    }
}
