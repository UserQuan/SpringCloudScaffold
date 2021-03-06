package com.chen.common.exception;

public enum ErrorEnum {
    STRING_NOT_BLANK("1001","传参为空，参数名:{0}"),
    INTEGER_NOT_BLANK("1002","传参为空，参数名为{0}"),
    BOOLEAN_NOT_BLANK("1003","传参为空，参数名为{0}"),
    LIST_NOT_BLANK("1004","传参为空，参数名为{0}"),
    OBJECT_NOT_BLANK("1005","传参为空，参数名:{0}"),
    ;
    private String code;
    private String message;

    ErrorEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
