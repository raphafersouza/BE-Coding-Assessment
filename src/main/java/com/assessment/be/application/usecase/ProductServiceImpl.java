package com.assessment.be.application.usecase;

import com.assessment.be.adapter.repository.mapper.ProductEntityToProductMapper;
import com.assessment.be.adapter.repository.mapper.ProductToProductEntityMapper;
import com.assessment.be.adapter.repository.model.Product;
import com.assessment.be.domain.entity.ProductEntity;
import com.assessment.be.domain.exception.ProductException;
import com.assessment.be.adapter.repository.db.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductEntityToProductMapper productEntityToProductMapper;

    @Autowired
    private ProductToProductEntityMapper productToProductEntityMapper;

    @Override
    public List<ProductEntity> getAllProducts() {
        List<Product> listProduct = productRepository.findAll();
        return listProduct.stream().map(product -> productToProductEntityMapper.map(product)).collect(Collectors.toList());
    }

    @Override
    public ProductEntity getProductById(Long productId) {
        return productToProductEntityMapper.map(
                productRepository.findById(productId).orElseThrow(()-> new ProductException("Product not found"))
        );

    }

    @Override
    public ProductEntity saveProduct(ProductEntity product){
        return productToProductEntityMapper.map(productRepository.save(productEntityToProductMapper.map(product)));
    }

}
