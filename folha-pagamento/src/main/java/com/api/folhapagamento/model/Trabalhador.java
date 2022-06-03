package com.api.folhapagamento.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
@AllArgsConstructor
@Data
public class Trabalhador implements Serializable {
    private Long id;
    private String nome;
    private String cpf;
    private Double rendaDiaria;
}
