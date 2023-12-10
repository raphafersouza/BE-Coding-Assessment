package com.assessment.be.domain.entity;

public class ProductEntity {
    private Long id;
    private String name;

    public ProductEntity(String name) {
        this.name = name;
    }

    public ProductEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

}