package com.api.trabalhador.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_worker",uniqueConstraints={@UniqueConstraint(columnNames={"cpf"})})
public class Trabalhador implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(unique = true,nullable = false)
    private String cpf;
    @Column(nullable = false)
    private Double rendaDiaria;
}
