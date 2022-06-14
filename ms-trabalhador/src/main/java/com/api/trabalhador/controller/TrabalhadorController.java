package com.api.trabalhador.controller;

import com.api.trabalhador.model.Trabalhador;
import com.api.trabalhador.service.TrabalhadorService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/works")
@RequiredArgsConstructor
public class TrabalhadorController {

    private final TrabalhadorService trabalhadorService;
    @GetMapping
    public ResponseEntity<List<Trabalhador>> findAll(){
        return ResponseEntity.ok().body(trabalhadorService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Trabalhador> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(trabalhadorService.findById(id));
    }
    @GetMapping("/cpf")
    public ResponseEntity<Trabalhador> findBycpf(@RequestHeader(value = "cpf", required = true) String cpf){
        return ResponseEntity.ok().body(trabalhadorService.findByCpf(cpf));
    }

}
