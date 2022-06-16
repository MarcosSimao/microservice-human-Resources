package com.api.trabalhador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TrabalhadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhadorApplication.class, args);
	}

}
