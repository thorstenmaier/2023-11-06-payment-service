package com.example.paymentservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(CustomerPaymentMethodRepository repository) {
		return args -> {
			repository.save(new CustomerPaymentMethod(13l, PaymentMethod.PAYPAL));
        };
	}

}
