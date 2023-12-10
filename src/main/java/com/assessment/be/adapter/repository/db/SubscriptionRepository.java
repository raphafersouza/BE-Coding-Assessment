package com.assessment.be.adapter.repository.db;

import com.assessment.be.adapter.repository.model.Subscription;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SubscriptionRepository extends CrudRepository<Subscription,Long> {
    Subscription save(Subscription subscription);
    Optional<Subscription> findById(Long subscriptionId);

}
