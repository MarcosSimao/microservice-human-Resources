package com.api.folhapagamento.repository;


import com.api.folhapagamento.model.Trabalhador;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;


@Component
//@FeignClient(name = "ms-trabalhador",url = "http://localhost:8001")
@FeignClient("ms-trabalhador")
public interface TrabalhadorFeingnCliente {

    @GetMapping("/works/cpf")
    ResponseEntity<Trabalhador> findBycpf(@RequestHeader(value = "cpf", required = true) String cpf);
}
