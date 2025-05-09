package com.verdea_api.verdea.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class AuthController {
    @GetMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Pong");
    }
}
