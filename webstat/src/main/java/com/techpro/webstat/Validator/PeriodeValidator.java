package com.techpro.webstat.Validator;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.techpro.webstat.models.Periodes;
public class PeriodeValidator implements Validator {

    public boolean supports(Class<?> paramClass) {
        return Periodes.class.equals(paramClass);
    }

    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "periode", "valid.colour");
    }
}