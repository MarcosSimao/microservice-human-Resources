package com.api.trabalhador.repository;

import com.api.trabalhador.model.Trabalhador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrabalhadorRepository extends JpaRepository<Trabalhador,Long> {

    Optional<Trabalhador> findByCpf(String cpf);
}
