package com.tulies.sell.exception;

import com.tulies.sell.enums.ResultEnum;

/**
 * @author 王嘉炀
 * @date 2018/6/30 下午4:15
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public SellException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }
}
