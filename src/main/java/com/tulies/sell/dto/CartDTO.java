package com.tulies.sell.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 王嘉炀
 * @date 2018/6/30 下午4:48
 */
@Data
@AllArgsConstructor
public class CartDTO {
    private String productId;

    private Integer productQuantity;
}
