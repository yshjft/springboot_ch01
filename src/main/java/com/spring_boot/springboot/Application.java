package com.spring_boot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @SpringBootApplication
// 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동을 설정
// 이 코드가 있는 부분 부터 설정을 읽어가지 때문에 프로젝트 최상단에 위치

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
