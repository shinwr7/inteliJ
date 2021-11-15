package com.ict.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/hello")
    public String[] hello() {
        return new String[] {"Hello", "World"};
    }

    @GetMapping("intelij")
    public String intelij() {
        return "오오 재밌네";
    }
}
