package com.novatel.catalog.service.impl;

import com.novatel.catalog.entity.Products;
import com.novatel.catalog.repository.ProductsRepository;
import com.novatel.catalog.service.ProductsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductsServiceImpl implements ProductsService {
    private final ProductsRepository productsRepository;
    @Override
    public Products getProduct(Long productId) {
        Optional<Products> product = productsRepository.findById(productId);
        return product.orElse(null);
    }

    @Override
    public List<Products> getAllProductList() {
        return productsRepository.findAll();
    }
}
