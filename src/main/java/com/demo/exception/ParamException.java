package com.demo.exception;

import com.demo.constant.StatusConstant;

/**
 * 参数异常（参数错误、缺少参数、参数类型错误等）
 * 对应StatusConstant.ErrorStatus中10001、10006、10009等参数相关错误码
 */
public class ParamException extends AbstractBaseException {

    // 默认参数错误
    public ParamException() {
        super(StatusConstant.ErrorStatus.ILLEGAL_ARGUMENT);
    }

    // 自定义参数错误信息
    public ParamException(String message) {
        super(StatusConstant.ErrorStatus.ILLEGAL_ARGUMENT, message);
    }

    // 传入指定参数相关枚举（如缺少参数、参数类型错误）
    public ParamException(StatusConstant.ErrorStatus status) {
        super(status);
    }

    // 传入指定参数枚举 + 自定义信息
    public ParamException(StatusConstant.ErrorStatus status, String message) {
        super(status, message);
    }
}