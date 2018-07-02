package com.tulies.sell.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author 王嘉炀
 * @date 2018/6/30 下午3:02
 */
@Getter
@AllArgsConstructor
public enum OrderStatusEnum {
    NEW(0, "新下单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消");

    private Integer code;
    private String message;

}
