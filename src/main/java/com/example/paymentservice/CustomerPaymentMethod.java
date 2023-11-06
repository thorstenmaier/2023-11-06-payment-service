package com.example.paymentservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CustomerPaymentMethod {

    @Id
    @GeneratedValue
    private Long id;

    private Long customerId;

    private PaymentMethod paymentMethod;

    public CustomerPaymentMethod() {
    }

    public CustomerPaymentMethod(Long customerId, PaymentMethod paymentMethod) {
        this.customerId = customerId;
        this.paymentMethod = paymentMethod;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "CustomerPaymentMethod{" +
                "customerId=" + customerId +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
