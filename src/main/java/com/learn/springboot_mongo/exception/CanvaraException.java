package com.learn.springboot_mongo.exception;
/**
 * @author amit pal
 */
public class CanvaraException extends Exception {
    public CanvaraException(String message) {
        super(message);
    }

    public CanvaraException(String message, Throwable th) {
        super(message, th);
    }
}
