package com.assessment.be.adapter.controller;

import com.assessment.be.adapter.model.response.ErrorResponse;
import com.assessment.be.domain.exception.ProductException;
import com.assessment.be.domain.exception.SubscriptionException;
import com.assessment.be.domain.exception.SubscriptionStatusException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorHandlerController extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {ProductException.class})
    protected ResponseEntity<Object> handleProductException (ProductException productException, WebRequest webRequest) {
        return handleExceptionInternal(productException,
                new ErrorResponse(productException.getMessage()),
                new HttpHeaders(),
                HttpStatus.NOT_FOUND,
                webRequest);
    }

    @ExceptionHandler(value = {SubscriptionException.class})
    protected ResponseEntity<Object> handleSubscriptionException (SubscriptionException subscriptionException, WebRequest webRequest) {
        return handleExceptionInternal(subscriptionException,
                new ErrorResponse(subscriptionException.getMessage()),
                new HttpHeaders(),
                HttpStatus.NOT_FOUND,
                webRequest);
    }

    @ExceptionHandler(value = {SubscriptionStatusException.class})
    protected ResponseEntity<Object> handleSubscriptionStatusException (SubscriptionStatusException subscriptionStatusException, WebRequest webRequest) {
        return handleExceptionInternal(subscriptionStatusException,
                new ErrorResponse(subscriptionStatusException.getMessage()),
                new HttpHeaders(),
                HttpStatus.UNPROCESSABLE_ENTITY,
                webRequest);
    }
}
