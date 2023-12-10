package com.assessment.be.application.usecase;

import com.assessment.be.domain.entity.SubscriptionEntity;

public interface SubscriptionService {
    SubscriptionEntity buySubscription(Long productId);
    SubscriptionEntity getSubscriptionById(Long subscriptionId);
    SubscriptionEntity pauseSubscription(Long subscriptionId);
    SubscriptionEntity resumeSubscription(Long subscriptionId);
    void cancelSubscription(Long subscriptionId);
}
