package com.demo.exception;

import com.demo.constant.StatusConstant;

/**
 * 文件异常（文件上传、下载、格式错误等）
 * 对应StatusConstant.ErrorStatus中10004、60001等文件相关错误码
 * 场景：麻醉记录附件上传失败、文件过大、格式不支持等
 */
public class FileException extends AbstractBaseException {

    // 默认文件错误
    public FileException() {
        super(StatusConstant.ErrorStatus.MULTIPART_TOO_LARGE);
    }

    // 自定义文件错误信息
    public FileException(String message) {
        super(StatusConstant.ErrorStatus.MULTIPART_TOO_LARGE, message);
    }

    // 传入指定文件相关枚举（如文件不存在、上传失败）
    public FileException(StatusConstant.ErrorStatus status) {
        super(status);
    }

    // 传入指定文件枚举 + 自定义信息
    public FileException(StatusConstant.ErrorStatus status, String message) {
        super(status, message);
    }
}