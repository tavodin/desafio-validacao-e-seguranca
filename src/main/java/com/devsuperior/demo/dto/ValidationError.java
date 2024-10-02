package com.devsuperior.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{

    List<FieldMessage> errors = new ArrayList<>();

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message) {
        errors.add(new FieldMessage(fieldName, message));
    }
}
