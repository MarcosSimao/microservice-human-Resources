package com.recursoshumano.payroll.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.recursoshumano.payroll.entities.Worker;


@Component
@FeignClient(name="ms-worker", url="http://localhost:8001", path="/workers")
public interface workerFeignClient {
	
	
	 @GetMapping(value="/{id}")
		ResponseEntity<Worker> findById(@PathVariable Long id);

}
