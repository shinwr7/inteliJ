package com.ict.boot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Boot2Controller {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/name")
    public String name(Model model) {
        model.addAttribute("name", "신우람");
        return "name";
    }
}
