package com.assessment.be.adapter.controller;

import com.assessment.be.adapter.mapper.SubscriptionEntityToSubscriptionResponseMapper;
import com.assessment.be.adapter.model.response.SubscriptionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.assessment.be.application.usecase.SubscriptionService;


@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {
    @Autowired
    private SubscriptionService subscriptionService;
    @Autowired
    private SubscriptionEntityToSubscriptionResponseMapper subscriptionEntityToSubscriptionResponseMapper;


    @PostMapping("/{productId}")
    public ResponseEntity<SubscriptionResponse> buySubscription(@PathVariable long productId) {
        return ResponseEntity.ok(subscriptionEntityToSubscriptionResponseMapper.map(subscriptionService.buySubscription(productId)));
    }

    @GetMapping("/{subscriptionId}")
    public ResponseEntity<SubscriptionResponse> getSubscriptionById(@PathVariable long subscriptionId) {
        return ResponseEntity.ok(subscriptionEntityToSubscriptionResponseMapper.map(subscriptionService.getSubscriptionById(subscriptionId)));
    }

    @PutMapping("/pause/{subscriptionId}")
    public ResponseEntity<SubscriptionResponse> pauseSubscription(@PathVariable long subscriptionId) {
        return  ResponseEntity.ok(subscriptionEntityToSubscriptionResponseMapper.map(subscriptionService.pauseSubscription(subscriptionId)));
    }

    @PutMapping ("/resume/{subscriptionId}")
    public ResponseEntity<SubscriptionResponse> resumeSubscription(@PathVariable long subscriptionId) {
        return  ResponseEntity.ok(subscriptionEntityToSubscriptionResponseMapper.map(subscriptionService.resumeSubscription(subscriptionId)));
    }

    @DeleteMapping("/cancel/{subscriptionId}")
    public ResponseEntity<?> cancelSubscription(@PathVariable long subscriptionId) {
            subscriptionService.cancelSubscription(subscriptionId);
            return ResponseEntity.ok("Delete sucessfully");
    }

}
