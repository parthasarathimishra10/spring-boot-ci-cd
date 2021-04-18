package com.partha.cicd.controller;

import com.partha.cicd.dto.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/message")
    public ResponseDto getResponse(){
        return new ResponseDto("Welcome to Spring Boot with Git, Jenkins, Docker and Kubernetes");
    }
}
