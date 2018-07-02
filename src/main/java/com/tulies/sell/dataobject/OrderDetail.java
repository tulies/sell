package com.tulies.sell.dataobject;

import com.tulies.sell.enums.OrderStatusEnum;
import com.tulies.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 王嘉炀
 * @date 2018/6/30 下午2:59
 */
@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;
    /** 订单id. */
    private String orderId;
    /** 商品id. */
    private String productId;
    /** 商品名称. */
    private String productName;
    /** 商品价格. */
    private BigDecimal productPrice;
    /** 商品数量. */
    private Integer productQuantity;
    /** 商品图标. */
    private String productIcon;
}
