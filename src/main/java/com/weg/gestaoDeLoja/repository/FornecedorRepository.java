package com.weg.gestaoDeLoja.repository;

import com.weg.gestaoDeLoja.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
    boolean existsByNome(String nome);
}
