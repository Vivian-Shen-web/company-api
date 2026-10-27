package com.demo.exception;

import com.demo.constant.StatusConstant;

/**
 * 系统异常（系统内部错误、中间件异常、第三方调用异常等）
 * 对应StatusConstant.ErrorStatus中10000、20000、40001等系统相关错误码
 * 场景：数据库连接失败、Redis异常、网关异常、IO异常等
 */
public class SystemException extends AbstractBaseException {

    // 默认系统错误
    public SystemException() {
        super(StatusConstant.ErrorStatus.INTERNAL_SERVER_ERROR);
    }

    // 自定义系统错误信息
    public SystemException(String message) {
        super(StatusConstant.ErrorStatus.INTERNAL_SERVER_ERROR, message);
    }

    // 传入指定系统相关枚举（如网关异常、Redis异常）
    public SystemException(StatusConstant.ErrorStatus status) {
        super(status);
    }

    // 传入指定系统枚举 + 自定义信息
    public SystemException(StatusConstant.ErrorStatus status, String message) {
        super(status, message);
    }
}