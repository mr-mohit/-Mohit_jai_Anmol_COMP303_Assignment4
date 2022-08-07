package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.demo.advice.ValidationExceptionHandler;

@SpringBootApplication
public class BookMicorserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMicorserviceApplication.class, args);
		System.out.println("Book microservice started");
	}

}
