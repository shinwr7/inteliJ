package com.ict.boot3.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class Boot3Controller {

    @GetMapping("/hello")
    public String hello() {
        log.info("연결 완료되었습니다.");
        return "hello";
    }

}
