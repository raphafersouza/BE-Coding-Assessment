package com.assessment.be.adapter.mapper;

import com.assessment.be.adapter.model.response.SubscriptionResponse;
import com.assessment.be.domain.entity.SubscriptionEntity;

public interface SubscriptionEntityToSubscriptionResponseMapper {

    SubscriptionResponse map(SubscriptionEntity subscriptionEntity);
}
