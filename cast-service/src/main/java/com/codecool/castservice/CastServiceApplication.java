package com.codecool.castservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CastServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CastServiceApplication.class, args);
	}

}
