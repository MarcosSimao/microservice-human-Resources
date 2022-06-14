package com.api.folhapagamento.controller;

import com.api.folhapagamento.model.Pagamento;
import com.api.folhapagamento.service.FolhaPagamentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="/payments")
@Slf4j
public class FolhaPagamentoController {

     private final FolhaPagamentoService folhaPagamentoService;
    @GetMapping(value="/days/{days}")
    public  ResponseEntity<Pagamento> getPagamento(@PathVariable Integer days, @RequestHeader(value = "cpf",required = true)String cpf){
   log.info("cpf= {}",cpf);
        return ResponseEntity.ok().body(folhaPagamentoService.getPagamento(cpf, days));
   }
}
