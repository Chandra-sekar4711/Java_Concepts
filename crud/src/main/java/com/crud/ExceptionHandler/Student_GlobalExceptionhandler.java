package com.crud.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.crud.CustomException.Student_NotRegister_Exception;

@RestControllerAdvice
public class Student_GlobalExceptionhandler {

    @ExceptionHandler(Student_NotRegister_Exception.class)
    public ResponseEntity<Map<String, String>> handleUserNotFound(Student_NotRegister_Exception ex) {
        Map<String, String> error = new HashMap<>();
        error.put("error", ex.getMessage());
        error.put("status", "404");
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }}