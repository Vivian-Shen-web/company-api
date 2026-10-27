package com.demo.exception;

import com.demo.constant.StatusConstant;

/**
 * 权限异常（认证失败、权限不足、Token异常等）
 * 对应StatusConstant.ErrorStatus中401、403、30001等权限相关错误码
 * 场景：麻醉医生无操作权限、Token过期、未登录等
 */
public class PermissionException extends AbstractBaseException {

    // 默认权限不足
    public PermissionException() {
        super(StatusConstant.ErrorStatus.FORBIDDEN);
    }

    // 自定义权限错误信息
    public PermissionException(String message) {
        super(StatusConstant.ErrorStatus.FORBIDDEN, message);
    }

    // 传入指定权限相关枚举（如Token过期、未认证）
    public PermissionException(StatusConstant.ErrorStatus status) {
        super(status);
    }

    // 传入指定权限枚举 + 自定义信息
    public PermissionException(StatusConstant.ErrorStatus status, String message) {
        super(status, message);
    }
}