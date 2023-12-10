package com.assessment.be.adapter.repository.mapper;

import com.assessment.be.adapter.repository.model.Subscription;
import com.assessment.be.domain.entity.SubscriptionEntity;

public interface SubscriptionToSubscriptionEntityMapper {

    SubscriptionEntity map (Subscription subscription);
}
