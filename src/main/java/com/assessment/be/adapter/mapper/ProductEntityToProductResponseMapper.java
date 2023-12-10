package com.assessment.be.adapter.mapper;

import com.assessment.be.adapter.model.response.ProductResponse;
import com.assessment.be.domain.entity.ProductEntity;

public interface ProductEntityToProductResponseMapper {


    ProductResponse map(ProductEntity productEntity);

}
