package com.assessment.be.adapter.repository.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long productId;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean active;

    public Subscription(Long productId, LocalDate startDate, LocalDate endDate, boolean active) {
        this.productId = productId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
    }

    public Subscription() {
    }

    public Long getId() { return id; }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public void setActive(boolean active) {
        this.active = active;
    }

}
