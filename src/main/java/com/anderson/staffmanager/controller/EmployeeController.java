package com.anderson.staffmanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeController {


    @PostMapping("/employees")
    public ResponseEntity<Map<String, String>> CreateEmployee() {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("message", "Employee created successfully"));
    }
}