package com.example.paymentservice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface CustomerPaymentMethodRepository extends JpaRepository<CustomerPaymentMethod, Long> {
    Collection<CustomerPaymentMethod> findByCustomerId(Long customerId);
}
