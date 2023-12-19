package com.workintech.grocer.fruitsandvegetables.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class FruitAndVegetableException extends RuntimeException {
    private HttpStatus httpStatus;

    public FruitAndVegetableException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
