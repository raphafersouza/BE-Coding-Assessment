package com.assessment.be.adapter.repository.mapper;

import com.assessment.be.adapter.repository.model.Subscription;
import com.assessment.be.domain.entity.SubscriptionEntity;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionToSubscriptionEntityMapperImpl implements SubscriptionToSubscriptionEntityMapper {
    @Override
    public SubscriptionEntity map(Subscription subscription) {
        return new SubscriptionEntity(subscription.getId(),
                subscription.getProductId(),
                subscription.getStartDate(),
                subscription.getEndDate(),
                subscription.isActive()
                );
    }
}
