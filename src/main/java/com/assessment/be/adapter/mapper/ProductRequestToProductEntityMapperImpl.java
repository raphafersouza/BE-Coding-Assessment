package com.assessment.be.adapter.mapper;

import com.assessment.be.adapter.model.request.ProductRequest;
import com.assessment.be.domain.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductRequestToProductEntityMapperImpl implements ProductRequestToProductEntityMapper {
    @Override
    public ProductEntity map(ProductRequest productRequest) {
        return new ProductEntity(productRequest.getName());
    }
}
