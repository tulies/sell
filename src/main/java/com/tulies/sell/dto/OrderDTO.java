package com.tulies.sell.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tulies.sell.dataobject.OrderDetail;
import com.tulies.sell.enums.OrderStatusEnum;
import com.tulies.sell.enums.PayStatusEnum;
import com.tulies.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author 王嘉炀
 * @date 2018/6/30 下午2:59
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)  // 这也注解也可以统一在配置文件中配置
public class OrderDTO {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus;
    private Integer payStatus;
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    private List<OrderDetail> orderDetailList;

}
