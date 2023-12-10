package com.assessment.be.adapter.mapper;

import com.assessment.be.adapter.model.response.SubscriptionResponse;
import com.assessment.be.domain.entity.SubscriptionEntity;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionEntityToSubscriptionResponseMapperImpl implements SubscriptionEntityToSubscriptionResponseMapper {

    @Override
    public SubscriptionResponse map(SubscriptionEntity subscriptionEntity) {

        return new SubscriptionResponse(
                subscriptionEntity.getId(),
                subscriptionEntity.getProductId(),
                subscriptionEntity.getStartDate(),
                subscriptionEntity.getEndDate(),
                subscriptionEntity.isActive());
    }

}
