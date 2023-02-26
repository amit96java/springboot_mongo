package com.learn.springboot_mongo.exception;
/**
 * @author amit pal
 */
public class DataValidationException extends CanvaraException {
    public DataValidationException(String message) {
        super(message);
    }

    public DataValidationException(String message, Throwable th) {
        super(message, th);
    }
}
