package com.novatel.catalog.controller;

import com.novatel.catalog.entity.Products;
import com.novatel.catalog.service.ProductsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/products")
public class ProductsController {
    private final ProductsService productsService;

    @GetMapping("/{id}")
    public ResponseEntity<Products> getProductById(@PathVariable Long id){
        return ResponseEntity.ok(productsService.getProduct(id));
    }

    @GetMapping("/getAllProducts")
    public ResponseEntity<List<Products>> getAllProducts(){
        return ResponseEntity.ok(productsService.getAllProductList());
    }
}
