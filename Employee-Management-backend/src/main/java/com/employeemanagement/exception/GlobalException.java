package com.employeemanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalException {


    @ExceptionHandler(EmployeeException.class)
    public ResponseEntity<MyErrorDetails> myExceptionHandler(EmployeeException ie, WebRequest req) {


        MyErrorDetails err = MyErrorDetails.builder()
                .localDateTime(LocalDateTime.now())
                .message(ie.getMessage())
                .details(req.getDescription(false))
                .build();

        return new ResponseEntity<MyErrorDetails>(err, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> myExceptionHandler(Exception ie) {

        return new ResponseEntity<String>(ie.getMessage(), HttpStatus.BAD_REQUEST);

    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<MyErrorDetails> myMANVExceptionHandler(MethodArgumentNotValidException me) {

        MyErrorDetails err = MyErrorDetails.builder()
                .localDateTime(LocalDateTime.now())
                .message(me.getBindingResult().getFieldError().getDefaultMessage())
                .details(me.getBindingResult().getFieldError().getField())
                .build();

        return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
    }

}
