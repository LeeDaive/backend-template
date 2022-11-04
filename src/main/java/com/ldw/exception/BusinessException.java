package com.ldw.exception;

import com.ldw.common.ErrorCode;

/**
 * @Classname BusinessException
 * @Description TODO
 * @Date 2022/11/4 14:01
 * @Created by ldw
 */
public class BusinessException extends RuntimeException{

    private final String description;

    private final int code;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.description = errorCode.getDescription();
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.description = description;
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }

    public String description() {
        return description;
    }
}
