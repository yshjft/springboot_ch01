package com.spring_boot.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // json을 반환하는 컨트롤러를 만들어 줍니다

public class HelloController {
    @GetMapping("/hello") // Get 요청을 받을 수 있는 API를 만들어 줍니다, '/hello'로 요청이 드렁오면 "hello"라는 문자열 반환
    public String hello() {
        return "hello";
    }
}
