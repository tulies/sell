package com.tulies.sell.service;

import com.tulies.sell.dataobject.ProductCategory;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * @author 王嘉炀
 * @date 2018/6/29 下午11:43
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
