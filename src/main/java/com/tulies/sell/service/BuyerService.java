package com.tulies.sell.service;

import com.tulies.sell.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 王嘉炀
 * @date 2018/7/1 上午12:09
 */
public interface BuyerService {

    OrderDTO findOrderOne(String openid, String orderId);

    OrderDTO cancelOrder(String openid, String orderId);
}
