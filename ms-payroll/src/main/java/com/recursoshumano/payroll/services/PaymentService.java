package com.recursoshumano.payroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.recursoshumano.payroll.entities.Payment;
import com.recursoshumano.payroll.entities.Worker;

@Service
public class PaymentService {
	@Value("${ms-worker.host}")
	private String host;
	@Autowired
	private RestTemplate restTemplate;

	public Payment getPayment(long workerid,int days) {
		Map<String,String> mapperUri = new HashMap<>();
		mapperUri.put("id", Long.toString(workerid));
		
		Worker worker = restTemplate.getForObject(host+"/workers/{id}", Worker.class, mapperUri);
		return new Payment(worker.getName(),worker.getRendaDiaria(),days);
	}
	}
