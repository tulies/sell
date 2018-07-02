package com.tulies.sell.converter;

import com.tulies.sell.dataobject.OrderMaster;
import com.tulies.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 王嘉炀
 * @date 2018/6/30 下午5:41
 */
public class OrdeerMaster2OrderDTOConverter {
    public static OrderDTO convert(OrderMaster orderMaster) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e->convert(e)).collect(Collectors.toList());

    }
}
