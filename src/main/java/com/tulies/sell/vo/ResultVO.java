package com.tulies.sell.vo;

import lombok.Data;

/**
 * @author 王嘉炀
 * @date 2018/6/30 下午1:29
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;
}
