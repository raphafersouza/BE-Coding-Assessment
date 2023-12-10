package com.assessment.be.domain.entity;

import java.time.LocalDate;

public class SubscriptionEntity {
    private Long id;
    private Long productId;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean active;

    public SubscriptionEntity(Long productId, LocalDate startDate, LocalDate endDate, boolean active) {
        this.productId = productId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
    }

    public SubscriptionEntity(Long productId) {
        this.productId = productId;
    }

    public SubscriptionEntity(Long id, Long productId, LocalDate startDate, LocalDate endDate, boolean active) {
        this.id = id;
        this.productId = productId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}