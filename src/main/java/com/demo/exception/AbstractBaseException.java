package com.demo.exception;

import com.demo.constant.StatusConstant;

/**
 * 异常的基类
 **/
public abstract class AbstractBaseException extends RuntimeException {
    public AbstractBaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public AbstractBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbstractBaseException(String message) {
        super(message);
    }

    public AbstractBaseException(Throwable cause) {
        super(cause);
    }

    /**
     * 错误码（对应StatusConstant中的状态值）
     */
    private int code;

    /**
     * 错误信息（对应StatusConstant中的描述）
     */
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 构造方法1：直接传入StatusConstant.Status（推荐，统一错误码）
     *
     * @param status 状态枚举（SuccessStatus/ErrorStatus）
     */
    public AbstractBaseException(StatusConstant.Status status) {

        super(status.getMessage());

        this.code = status.value();
        this.message = status.getMessage();
    }

    /**
     * 构造方法2：传入Status枚举 + 自定义错误信息（灵活适配业务场景）
     *
     * @param status  状态枚举
     * @param message 自定义错误信息
     */
    public AbstractBaseException(StatusConstant.Status status, String message) {

        super(message);

        this.code = status.value();
        this.message = message;
    }

    /**
     * 构造方法3：传入错误码 + 自定义错误信息（特殊场景使用）
     *
     * @param code    错误码
     * @param message 错误信息
     */
    public AbstractBaseException(int code, String message) {

        super(message);

        this.code = code;
        this.message = message;
    }
}
