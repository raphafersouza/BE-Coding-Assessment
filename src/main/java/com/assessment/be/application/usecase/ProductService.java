package com.assessment.be.application.usecase;

import com.assessment.be.adapter.repository.model.Product;
import com.assessment.be.domain.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProducts();
    ProductEntity getProductById(Long productId);
    ProductEntity saveProduct(ProductEntity product);
}
