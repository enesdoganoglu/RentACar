package com.bilgeadam.exception;

import lombok.Getter;

@Getter
public class AracKiralamaException extends RuntimeException{
    private final ErrorType errorType;
    public AracKiralamaException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType=errorType;
    }

    public AracKiralamaException(ErrorType errorType, String message){
        super(message);
        this.errorType=errorType;
    }
}
