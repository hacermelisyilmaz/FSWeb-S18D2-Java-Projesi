package com.workintech.grocer.fruitsandvegetables.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalErrorHandler {
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(FruitAndVegetableException fruitAndVegetableException) {
        ErrorResponse errorResponse = new ErrorResponse(fruitAndVegetableException.getMessage());
        return new ResponseEntity<>(errorResponse, fruitAndVegetableException.getHttpStatus());
    }
}
