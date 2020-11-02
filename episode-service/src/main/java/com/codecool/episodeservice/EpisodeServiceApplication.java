package com.codecool.episodeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EpisodeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EpisodeServiceApplication.class, args);
	}

}
