package com.tulies.sell.service;

import com.tulies.sell.dataobject.ProductInfo;
import com.tulies.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author 王嘉炀
 * @date 2018/6/30 上午11:10
 */
public interface ProductService {
    ProductInfo findOne(String productId);

    // 查询所有在架的商品列表
    List<ProductInfo> findUpAll();
    Page<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);

    // 加库存
    void increaseStock(List<CartDTO> cartDTOList);

    // 减库存
    void decreaseStock(List<CartDTO> cartDTOList);




}
