package com.tulies.sell.repository;

import com.tulies.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 王嘉炀
 * @date 2018/6/29 下午10:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = productCategoryRepository.findOne(1);
        System.out.println(productCategory);
    }

    @Test
//    @Transactional //这个是回滚用的
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("男生最爱", 4);
//        productCategory.setCategoryName("女生最爱");
//        productCategory.setCategoryType(3);
        ProductCategory result = productCategoryRepository.save(productCategory);
        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null, result);
    }

    @Test
    public void updateTest(){
        ProductCategory productCategory = productCategoryRepository.findOne(3);
//        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(3);
        productCategoryRepository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list = Arrays.asList(2, 3, 4);
        List<ProductCategory> result = productCategoryRepository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }

}