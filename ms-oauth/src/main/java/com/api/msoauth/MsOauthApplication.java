package com.api.msoauth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@Slf4j
public class MsOauthApplication {

	public static void main(String[] args) {
		log.info("Informacao: {}","teste info");
		log.error("Informacao: {}","teste erro");
		log.warn("Informacao: {}","teste warn");
		SpringApplication.run(MsOauthApplication.class, args);
	}

}
