package com.lcwd.user.hotelService.hotelService.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, Object>> resourceNotFoundHandler(ResourceNotFoundException re){
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("message", re.getMessage());
        hashMap.put("success", false);
        return new ResponseEntity<>(hashMap, HttpStatus.NOT_FOUND);
    }

}
