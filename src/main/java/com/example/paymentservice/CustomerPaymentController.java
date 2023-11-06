package com.example.paymentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerPaymentController {

    @GetMapping("customerPaymentMethod/{id}")
    public CustomerPaymentMethodResource getCustomerPaymentMethod(@PathVariable("id") Long customerId) {
        // TODO Access database
        return new CustomerPaymentMethodResource(List.of(PaymentMethod.PAYPAL));
    }
}
