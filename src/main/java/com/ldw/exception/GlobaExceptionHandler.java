package com.ldw.exception;

import com.ldw.common.BaseResponse;
import com.ldw.common.ErrorCode;
import com.ldw.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Classname GlobaExceptionHandler
 * @Description TODO
 * @Date 2022/11/4 14:02
 * @Created by ldw
 */

@Slf4j
@ControllerAdvice
public class GlobaExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse businessExceptionHandler(BusinessException e) {
        log.error("bussinessException:" + e.getMessage(), e);
        return ResultUtils.error(e.getCode(), e.description(), e.description());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse businessExceptionHandler(RuntimeException e) {
        log.error("runtimeException", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, e.getMessage(), "");
    }
}
