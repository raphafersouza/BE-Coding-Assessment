package com.assessment.be.adapter.repository.mapper;

import com.assessment.be.adapter.repository.model.Product;
import com.assessment.be.domain.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductToProductEntityMapperImpl implements  ProductToProductEntityMapper{

    @Override
    public ProductEntity map(Product product) {
        return new ProductEntity(product.getId(), product.getName());
    }
}
