package com.api.trabalhador.service;

import com.api.trabalhador.model.Trabalhador;
import com.api.trabalhador.repository.TrabalhadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TrabalhadorService {
    private final TrabalhadorRepository trabalhadorRepository;

    public List<Trabalhador> findAll(){
        return trabalhadorRepository.findAll();
    }
    public Trabalhador findById(Long id){
        Optional<Trabalhador> trabalhador= trabalhadorRepository.findById(id);
        return trabalhador.get();
    }

    public Trabalhador findByCpf(String cpf){
        Optional<Trabalhador> trabalhador= trabalhadorRepository.findByCpf(cpf);
        return trabalhador.get();
    }


}
