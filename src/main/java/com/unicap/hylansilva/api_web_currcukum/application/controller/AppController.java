package com.unicap.hylansilva.api_web_currcukum.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public ResponseEntity<String> index() {
        return ResponseEntity.status(HttpStatus.OK).body("Bem Vindo!");
    }
}
