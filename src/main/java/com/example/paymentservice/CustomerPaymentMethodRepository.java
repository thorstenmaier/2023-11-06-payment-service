package com.example.paymentservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerPaymentMethodRepository extends JpaRepository<CustomerPaymentMethod, Long> {
}
