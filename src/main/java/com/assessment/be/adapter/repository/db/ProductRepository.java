package com.assessment.be.adapter.repository.db;

import com.assessment.be.adapter.repository.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product,Long> {

    List<Product> findAll();
    Optional<Product> findById(Long productId);

    Product save(Product product);


}