package com.billing.convert;

import com.billing.exception.DTOValidationException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.ValidationException;
import jakarta.validation.Validator;

import java.util.Set;

public class ValidatorDto {

    public static <T> void valid(T object) {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<T>> violations = validator.validate(object);
        if(!violations.isEmpty()){

            StringBuilder errorMessage = new StringBuilder("invalid field for object of type ");

            errorMessage.append(object.getClass().getSimpleName()).append(": ");

            for (ConstraintViolation<T> violation : violations) {
                errorMessage.append(violation.getPropertyPath().toString())
                        .append(": ").append(violation.getMessage()).append("; ");
            }

            throw new DTOValidationException(errorMessage.toString());
        }
    }
}
