package com.claycorp.nexstore.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.zalando.problem.ProblemModule;
import org.zalando.problem.validation.ConstraintViolationProblemModule;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class CustomerOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerOrderServiceApplication.class, args);
	}
	
	@Bean
	public ObjectMapper objectMapper() {
	    return new ObjectMapper()
	            .registerModule(new ProblemModule())
	            .registerModule(new ConstraintViolationProblemModule());
	}
}