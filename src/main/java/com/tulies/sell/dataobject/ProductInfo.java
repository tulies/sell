package com.tulies.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author 王嘉炀
 * @date 2018/6/30 上午10:34
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    private Integer productStatus;

    private Integer categoryType;
}
