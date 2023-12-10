package com.assessment.be.adapter.controller;

import com.assessment.be.adapter.mapper.ProductEntityToProductResponseMapper;
import com.assessment.be.adapter.mapper.ProductRequestToProductEntityMapper;
import com.assessment.be.adapter.model.request.ProductRequest;
import com.assessment.be.adapter.model.response.ProductResponse;
import com.assessment.be.application.usecase.ProductService;
import com.assessment.be.domain.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRequestToProductEntityMapper productRequestToProductEntityMapper;
    @Autowired
    private ProductEntityToProductResponseMapper productEntityToProductResponseMapper;

    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        List<ProductEntity> listProduct = productService.getAllProducts();
        List<ProductResponse> listProductResponse = listProduct.stream().map(product -> productEntityToProductResponseMapper.map(product)).collect(Collectors.toList());
        return ResponseEntity.ok(listProductResponse);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable Long productId) {
        return ResponseEntity.ok(productEntityToProductResponseMapper.map(productService.getProductById(productId)));
    }

    @PostMapping
    public ResponseEntity<ProductResponse> saveProduct(@RequestBody ProductRequest product){
        return ResponseEntity.ok(productEntityToProductResponseMapper.map(
                productService.saveProduct(productRequestToProductEntityMapper.map(product))));
    }

}
