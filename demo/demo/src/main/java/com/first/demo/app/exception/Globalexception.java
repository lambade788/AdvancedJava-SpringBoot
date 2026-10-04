package com.first.demo.app.exception;

import com.first.demo.app.service.Userservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class Globalexception {
    private final Logger logger = LoggerFactory.getLogger(Globalexception.class);

    @ExceptionHandler({UsernotFoundexception.class,IllegalArgumentException.class,NullPointerException.class})
    public ResponseEntity<Map<String ,Object>> handleIllegalArgumentException
            (Exception exception){
        logger.error("Error when finding user: ", exception);
        Map<String,Object> errorresponse = new HashMap<>();
        errorresponse.put("timestamp", LocalDateTime.now());
        errorresponse.put("Status", HttpStatus.BAD_REQUEST.value());
        errorresponse.put("error","Bad request");
        errorresponse.put("message", exception.getMessage());
        return new ResponseEntity<>(errorresponse , HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler( HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<Map<String ,Object>> handledeletemethod
            (Exception exception){
        Map<String,Object> errorresponse = new HashMap<>();
        errorresponse.put("timestamp", LocalDateTime.now());
        errorresponse.put("Status", HttpStatus.METHOD_NOT_ALLOWED.value());
        errorresponse.put("error"," Method not allowed");
        errorresponse.put("message", exception.getMessage());
        return new ResponseEntity<>(errorresponse , HttpStatus.METHOD_NOT_ALLOWED);
    }
}
