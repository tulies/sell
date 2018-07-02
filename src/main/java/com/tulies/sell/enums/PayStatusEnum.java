package com.tulies.sell.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 王嘉炀
 * @date 2018/6/30 下午3:02
 */
@Getter
@AllArgsConstructor
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;
    private Integer code;
    private String message;

}
