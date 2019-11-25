package com.pch.service;

import com.pch.config.FeignClientConfig;
import com.pch.service.fallback.ProductClientServiceFallbackFactory;
import com.pch.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "springcloud-provider-product",configuration = FeignClientConfig.class,fallbackFactory = ProductClientServiceFallbackFactory.class)
public interface IProductClientService {

    @RequestMapping("/product/get/{id}")
    Product getProduct(@PathVariable("id")long id);

    @RequestMapping("/product/list")
    List<Product> listProduct() ;

    @RequestMapping("/product/add")
    boolean addPorduct(Product product) ;
}
