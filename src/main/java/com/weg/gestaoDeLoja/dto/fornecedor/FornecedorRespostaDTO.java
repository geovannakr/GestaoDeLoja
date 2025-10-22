package com.weg.gestaoDeLoja.dto.fornecedor;

public record FornecedorRespostaDTO(
        Long id,
        String nome,
        String cnpj,
        String email,
        String telefone
) {
}