package com.assessment.be.application.usecase;

import com.assessment.be.adapter.repository.mapper.SubscriptionToSubscriptionEntityMapper;
import com.assessment.be.adapter.repository.model.Subscription;
import com.assessment.be.domain.entity.SubscriptionEntity;
import com.assessment.be.domain.exception.SubscriptionException;
import com.assessment.be.adapter.repository.db.SubscriptionRepository;
import com.assessment.be.domain.exception.SubscriptionStatusException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Autowired
    private  SubscriptionRepository subscriptionRepository;
    @Autowired
    private SubscriptionToSubscriptionEntityMapper subscriptionToSubscriptionEntityMapper;

    @Override
    public SubscriptionEntity buySubscription(Long productId) {
        if (subscriptionRepository.findById(productId).isPresent()) {
            throw new SubscriptionStatusException("The subscription already has an active to this product.");
        }

        Subscription newSubscription = new Subscription(
                productId,
                LocalDate.now(),
                LocalDate.now().plusMonths(1),
                true
        );


        return subscriptionToSubscriptionEntityMapper.map(subscriptionRepository.save(newSubscription));
    }

    @Override
    public SubscriptionEntity getSubscriptionById(Long subscriptionId) {
        return subscriptionToSubscriptionEntityMapper.map(subscriptionRepository.findById(subscriptionId).orElseThrow(()-> new SubscriptionException("Subscription not found")));
    }

    @Override
    public SubscriptionEntity pauseSubscription(Long subscriptionId) {
        Optional <Subscription> subscription = subscriptionRepository.findById(subscriptionId);

        if (subscription.isPresent()) {
            if (subscription.get().isActive()) {
                Subscription subscriptionPause = subscription.get();
                subscriptionPause.setActive(false);
                return subscriptionToSubscriptionEntityMapper.map(subscriptionRepository.save(subscriptionPause));
            } else {
                throw new SubscriptionStatusException("Subscription is already paused.");
            }
        }
        throw new SubscriptionException("The subscription was not found or is not active.");
    }

    @Override
    public SubscriptionEntity resumeSubscription(Long subscriptionId) {
        Optional <Subscription> subscription = subscriptionRepository.findById(subscriptionId);

        if (subscription.isPresent()) {
            if (!subscription.get().isActive()) {
                Subscription subscriptionPause = subscription.get();
                subscriptionPause.setActive(true);
                return subscriptionToSubscriptionEntityMapper.map(subscriptionRepository.save(subscriptionPause));
            } else {
                throw new SubscriptionStatusException("Subscription is already active.");
            }
        }
        throw new SubscriptionException("The subscription was not found or is not active.");
    }


    @Override
    public void cancelSubscription(Long subscriptionId)  {
        Optional <Subscription> subscription = subscriptionRepository.findById(subscriptionId);

        if (subscription.isPresent()) {
            subscriptionRepository.delete(subscription.get());
        } else {
            throw new SubscriptionException("The subscription was not found or is not active."); }
    }

}
