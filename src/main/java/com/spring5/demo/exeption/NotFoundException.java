package com.spring5.demo.exeption;

public class NotFoundException extends RuntimeException {
    public static final String messageTemplate = "%s !یافت نشد";

    public NotFoundException(String objectName) {
        super(String.format(messageTemplate, objectName));
    }
}