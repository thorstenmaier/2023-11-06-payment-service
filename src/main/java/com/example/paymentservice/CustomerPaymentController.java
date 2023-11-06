package com.example.paymentservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class CustomerPaymentController {

    private final CustomerPaymentMethodRepository customerPaymentMethodRepository;

    public CustomerPaymentController(CustomerPaymentMethodRepository customerPaymentMethodRepository) {
        this.customerPaymentMethodRepository = customerPaymentMethodRepository;
    }

    @GetMapping("customerPaymentMethod/{id}")
    public ResponseEntity<CustomerPaymentMethodResource> getCustomerPaymentMethod(@PathVariable("id") Long customerId) {
        Collection<CustomerPaymentMethod> customerPaymentMethods = customerPaymentMethodRepository.findByCustomerId(customerId);

        if (customerPaymentMethods.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(new CustomerPaymentMethodResource(customerPaymentMethods.stream().map(CustomerPaymentMethod::getPaymentMethod).toList()));
    }
}
