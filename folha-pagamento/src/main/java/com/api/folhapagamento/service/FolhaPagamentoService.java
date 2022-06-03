package com.api.folhapagamento.service;

import com.api.folhapagamento.model.Pagamento;
import com.api.folhapagamento.model.Trabalhador;
import com.api.folhapagamento.repository.TrabalhadorFeingnCliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FolhaPagamentoService {

    private final TrabalhadorFeingnCliente trabalhadorFeingnCliente;

    public Pagamento getPagamento(String cpf,Integer days){
       Trabalhador trabalhador =trabalhadorFeingnCliente.findBycpf(cpf).getBody();
        return new Pagamento(trabalhador.getNome(),trabalhador.getRendaDiaria(),days);
    }

}
