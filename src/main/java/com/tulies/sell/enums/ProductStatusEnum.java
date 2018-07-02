package com.tulies.sell.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 王嘉炀
 * @date 2018/6/30 上午11:16
 */
@Getter
@AllArgsConstructor
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;
    private String message;

}
