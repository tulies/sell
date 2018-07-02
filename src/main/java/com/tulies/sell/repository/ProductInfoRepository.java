package com.tulies.sell.repository;

import com.tulies.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 王嘉炀
 * @date 2018/6/30 上午10:37
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    List<ProductInfo> findByProductStatus(Integer producStatus);
}
