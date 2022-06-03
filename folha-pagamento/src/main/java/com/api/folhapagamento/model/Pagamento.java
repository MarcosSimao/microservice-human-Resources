package com.api.folhapagamento.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pagamento implements Serializable {
    private String nome;
    private Double rendaDiaria;
    private Integer dias;

    public Double getTotal(){
        return this.dias*this.rendaDiaria;
    }
}
