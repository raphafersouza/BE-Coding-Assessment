package com.assessment.be.adapter.model.response;

public class ProductResponse {
    private Long id;
    private String name;

    public ProductResponse(Long id, String name) {
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
