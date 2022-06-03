package com.recursoshumano.payroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recursoshumano.payroll.entities.Payment;
import com.recursoshumano.payroll.services.PaymentService;

@RestController
@RequestMapping(value="/payments")
public class PaymentResources {
 @Autowired
 private PaymentService ser;
 
 
 @GetMapping(value="/{workerid}/days/{days}")
 public ResponseEntity<Payment> getPayment1(@PathVariable Long workerid, @PathVariable Integer days){
	Payment pagamento= ser.getPayment(workerid, days);
	 
	 return ResponseEntity.ok(pagamento); 
 }
}
