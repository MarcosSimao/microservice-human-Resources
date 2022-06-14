package com.api.folhapagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@RibbonClient(name = "service2")
@SpringBootApplication
@EnableFeignClients
public class FolhaPagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FolhaPagamentoApplication.class, args);
	}

}
