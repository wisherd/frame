package com.cloud.exception;


/**
 * 参数异常类
 */
public class ParameterException extends BusinessException {

    public ParameterException(int code, String desc) {
        super(code,desc);
    }
  public ParameterException(int code, String message, Throwable cause) {
        super(message, cause);
        this.setCode(code);
    }
}
