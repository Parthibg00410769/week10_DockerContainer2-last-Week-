package com.ie.atu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week4BApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week4BApplication.class, args);
	}

}
