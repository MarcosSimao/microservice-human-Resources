package com.recursoshumano.payroll.services;

import org.springframework.stereotype.Service;

import com.recursoshumano.payroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerid,int days) {
		return new Payment("leticia",200.00,days);
	}
	}
