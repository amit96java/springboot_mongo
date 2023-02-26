package com.learn.springboot_mongo.exception;
/**
 * @author amit pal
 */
public class NotFoundException extends CanvaraException {
    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable th) {
        super(message, th);
    }
}
