package com.demo.exception;

import com.demo.constant.StatusConstant;

/**
 * 业务异常（麻醉项目核心业务逻辑错误）
 * 对应StatusConstant.ErrorStatus中10002、40003、40004等业务相关错误码
 * 场景：麻醉记录不存在、患者信息异常、流程不允许等
 */
public class BusinessException extends AbstractBaseException {

    // 默认业务错误
    public BusinessException() {
        super(StatusConstant.ErrorStatus.SERVICE_EXCEPTION);
    }

    // 自定义业务错误信息
    public BusinessException(String message) {
        super(StatusConstant.ErrorStatus.SERVICE_EXCEPTION, message);
    }

    // 传入指定业务相关枚举（如数据已存在、数据不存在）
    public BusinessException(StatusConstant.ErrorStatus status) {
        super(status);
    }

    // 传入指定业务枚举 + 自定义信息（贴合麻醉业务场景）
    public BusinessException(StatusConstant.ErrorStatus status, String message) {
        super(status, message);
    }
}