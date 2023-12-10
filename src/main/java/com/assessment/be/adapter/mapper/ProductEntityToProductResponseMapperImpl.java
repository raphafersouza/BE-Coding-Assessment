package com.assessment.be.adapter.mapper;

import com.assessment.be.adapter.model.response.ProductResponse;
import com.assessment.be.domain.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductEntityToProductResponseMapperImpl implements ProductEntityToProductResponseMapper {
    @Override
    public ProductResponse map(ProductEntity productEntity) {

        return new ProductResponse(productEntity.getId(), productEntity.getName());
    }
}
