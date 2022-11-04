package com.ldw.common;

/**
 * @Classname ErrorCode
 * @Description TODO
 * @Date 2022/11/4 14:14
 * @Created by ldw
 */

public enum ErrorCode {

    SUCCESS(0, "ok", ""),
    PARAMS_ERROR(4000, "请求参数异常", ""),
    NULL_ERROR(40001, "请求数据为空", ""),
    NOT_LOGIN(40100,  "无权限", ""),
    SYSTEM_ERROR(50000, "系统内部异常", "")
    ;


    private int code;

    private String message;

    private String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
