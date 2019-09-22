package com.zian.testresult.exceptin;

public class UserNotExiException extends RuntimeException {
    public UserNotExiException(String message) {
        super(message);
    }
}
