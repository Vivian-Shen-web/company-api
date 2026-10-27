package com.demo.exception;

/**
 * 异常的基类
 **/
public abstract class BaseException extends RuntimeException {
    protected BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    protected BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    protected BaseException(String message) {
        super(message);
    }

    protected BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException() {
        super();
    }
}
