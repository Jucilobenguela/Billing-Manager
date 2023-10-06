package com.billing.exception;

import jakarta.validation.ValidationException;

public class DTOValidationException extends ValidationException {
    public DTOValidationException(String message){
        super(message);
    }
}
