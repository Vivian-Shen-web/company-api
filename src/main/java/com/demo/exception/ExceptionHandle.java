package com.demo.exception;

import com.demo.constant.StatusConstant;
import com.demo.domain.web.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * 异常处理，避免抛出敏感信息
 */
@Slf4j
@ControllerAdvice
public class ExceptionHandle {
    private static final String ERROR_URI = "【异常URI】= {}";

    @ResponseBody
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public Object handle(HttpServletRequest request, Exception e) {
        log.error(ERROR_URI, request.getRequestURI(), e);
        if (e instanceof ServiceException) {
            return R.error(StatusConstant.ErrorStatus.SERVICE_EXCEPTION, e.getMessage());
        } else if (e instanceof UnAuthorizedException) {
            return R.error(StatusConstant.ErrorStatus.ILLEGAL_ACCESS, e.getMessage());
        } else if (e instanceof HttpMessageNotReadableException) {
            return R.error(StatusConstant.ErrorStatus.ILLEGAL_DATA);
        } else {
            return R.error(StatusConstant.ErrorStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
