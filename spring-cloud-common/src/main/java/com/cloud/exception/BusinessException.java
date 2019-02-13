package com.cloud.exception;

import com.cloud.commons.ResultCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BusinessException extends Exception {

    private int code;


    public BusinessException() {

        super(ResultCode.CODE_500.getDesc());
        this.code=ResultCode.CODE_500.getCode();
    }

    public BusinessException(String message) {
        super(message);
        this.code=ResultCode.CODE_500.getCode();
    }

    public BusinessException(int code, String message) {
        super(message);
        this.code=code;
    }
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
        this.code=ResultCode.CODE_500.getCode();
    }

}
