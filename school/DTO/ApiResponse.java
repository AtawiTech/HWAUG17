package com.example.school.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class ApiResponse {
    private String message;
    private Integer status;
}