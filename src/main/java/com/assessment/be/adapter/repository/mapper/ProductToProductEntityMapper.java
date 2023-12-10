package com.assessment.be.adapter.repository.mapper;

import com.assessment.be.adapter.repository.model.Product;
import com.assessment.be.domain.entity.ProductEntity;

public interface ProductToProductEntityMapper {

    ProductEntity map (Product product);
}
