package com.weg.gestaoDeLoja.repository;

import com.weg.gestaoDeLoja.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    boolean existsByNome(String nome);
}
