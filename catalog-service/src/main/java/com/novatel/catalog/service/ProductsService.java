package com.novatel.catalog.service;

import com.novatel.catalog.entity.Products;

import java.util.List;

public interface ProductsService {

    Products getProduct(Long productId);
    List<Products> getAllProductList();
}
