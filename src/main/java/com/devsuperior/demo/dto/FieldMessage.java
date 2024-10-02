package com.devsuperior.demo.dto;

public class FieldMessage {

    private String fieldName;
    private String message;

    public FieldMessage(String name, String message) {
        this.fieldName = name;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String name) {
        this.fieldName = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
