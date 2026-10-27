package com.demo.domain.web;

import com.demo.constant.StatusConstant;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * 返回结果封装类
 */
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "状态码", example = "200")
    private int code;

    @Schema(description = "提示信息")
    private String msg;

    @Schema(description = "返回数据")
    private T data;

    protected R() {
    }

    protected R(StatusConstant.Status stateCode) {
        this.code = stateCode.value();
        this.msg = stateCode.getMessage();
    }

    protected R(StatusConstant.Status stateCode, String msg) {
        this.code = stateCode.value();
        this.msg = msg;
    }

    protected R(StatusConstant.Status stateCode, T data) {
        this(stateCode);
        this.data = data;
    }

    private R(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> R<T> success() {
        return new R<>(StatusConstant.SuccessStatus.SUCCESS);
    }

    public static <T> R<T> success(T data) {
        return new R<T>(StatusConstant.SuccessStatus.SUCCESS, data);
    }

    public static <T> R<T> success(int code, String msg, T data) {
        return new R<>(code, msg, data);
    }

    public static <T> R<T> error(StatusConstant.ErrorStatus status, Throwable ex) {
        return new R<>(status, ex.getMessage());
    }

    public static <T> R<T> error(StatusConstant.ErrorStatus status, T data) {
        return new R<>(status, data);
    }

    public static <T> R<T> error(StatusConstant.ErrorStatus status) {
        return new R<>(status);
    }

    public static <T> R<T> error(StatusConstant.ErrorStatus status, String msg) {
        return new R<>(status, msg);
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public boolean isSuccess() {
        return this.code == StatusConstant.SuccessStatus.SUCCESS.value();
    }
}
