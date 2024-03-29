package com.api.msuser;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableEurekaClient
@SpringBootApplication
@Slf4j
public class MsUserApplication implements CommandLineRunner {
	@Autowired
     private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(MsUserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
     log.info("senha Criptografada {}",passwordEncoder.encode("12345"));
	}
}
