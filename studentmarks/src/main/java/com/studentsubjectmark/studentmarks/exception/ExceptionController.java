package com.studentsubjectmark.studentmarks.exception;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<Object> handleSNFException( StudentNotFoundException exp){
        ExceptionInfo exceptionInfo = new ExceptionInfo(exp.getMessage(), HttpStatus.NOT_FOUND, ZonedDateTime.now());
        return  new ResponseEntity<>(exceptionInfo,new HttpHeaders(),HttpStatus.NOT_FOUND);
    }
}
