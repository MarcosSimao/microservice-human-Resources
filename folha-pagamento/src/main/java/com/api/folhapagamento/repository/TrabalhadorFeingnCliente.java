package com.api.folhapagamento.repository;

import com.api.folhapagamento.model.Trabalhador;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Component
@FeignClient(name = "service2",url = "http://localhost:8001",path = "/works")
public interface TrabalhadorFeingnCliente {

    @GetMapping("/cpf")
    ResponseEntity<Trabalhador> findBycpf(@RequestHeader(value = "cpf", required = true) String cpf);
}
