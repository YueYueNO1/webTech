package com.example.webtech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.example.webtech.Mapper")
@SpringBootApplication
@ServletComponentScan
public class WebTechApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebTechApplication.class, args);
    }

}
