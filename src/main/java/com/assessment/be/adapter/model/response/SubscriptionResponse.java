package com.assessment.be.adapter.model.response;

import java.time.LocalDate;

public class SubscriptionResponse {
    private  Long id;
    private Long productId;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean active;

    public SubscriptionResponse(Long id, Long productId, LocalDate startDate, LocalDate endDate, boolean active) {
        this.id = id;
        this.productId = productId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public Long getProductId() {
        return productId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public boolean isActive() {
        return active;
    }
}

