package com.api.folhapagamento.service;

import com.api.folhapagamento.model.Pagamento;
import com.api.folhapagamento.model.Trabalhador;
import com.api.folhapagamento.model.exceptions.ObjectException;
import com.api.folhapagamento.model.exceptions.ObjectInternalErrorExcption;
import com.api.folhapagamento.repository.TrabalhadorFeingnCliente;
import feign.Feign;
import feign.FeignException;
import feign.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class FolhaPagamentoService {
   private HttpServletRequest request;
    private final TrabalhadorFeingnCliente trabalhadorFeingnCliente;

    public Pagamento getPagamento(String cpf,Integer days){
        try{
            Trabalhador trabalhador =trabalhadorFeingnCliente.findBycpf(cpf).getBody();
            log.info("o que evm {}",trabalhador);
            return new Pagamento(trabalhador.getNome(),trabalhador.getRendaDiaria(),days);
        }catch (FeignException e){
           log.info("caiu aqui {}",e.toString());
           throw new ObjectException(e);
        }catch (RuntimeException e){
            log.info("erro 500 {}",e.toString());
            throw new ObjectInternalErrorExcption(e.getMessage());
        }

    }

}
