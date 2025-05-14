package com.fullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ExternalapiexApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalapiexApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
