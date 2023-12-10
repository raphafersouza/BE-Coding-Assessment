package com.assessment.be.adapter.repository.mapper;

import com.assessment.be.adapter.repository.model.Product;
import com.assessment.be.domain.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductEntityToProductMapperImpl implements ProductEntityToProductMapper {
    @Override
    public Product map(ProductEntity product) {
        return new Product(product.getName());
    }
}
