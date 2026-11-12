package com.anderson.staffmanager.controller;

import com.anderson.staffmanager.dto.CreateEmployeeDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeController {


    @PostMapping("/employees")
    public ResponseEntity<Map<String, String>> CreateEmployee(@Valid @RequestBody CreateEmployeeDTO createEmployeeDTO) {
        System.out.println(createEmployeeDTO.toString());


        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("message", "Employee created successfully"));
    }
}