package com.zian.testresult.exceptin;

public class UserNotExiException extends RuntimeException {
    public UserNotExiException() {
        super("用户不存在");
    }
}
