package com.anderson.staffmanager.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public record CreateEmployeeDTO (
        @NotBlank(message = "Name is required.")
        @Size(min = 3, max = 100, message = "Name minimum 3 characters.")
        String name,
        @NotNull(message = "The date of birth is required.")
        @Past(message = "The date of birth must be in the past.")
        LocalDate date_of_birth,
        @NotNull(message = "The salary is required.")
        BigDecimal salary,
        @NotNull(message = "The status is required.")
        Boolean status
) {}