package com.weg.gestaoDeLoja.dto.fornecedorCerto;

public record FornecedorRespostaDTO(
        Long id,
        String nome,
        String cnpj,
        String email,
        String telefone
) {
}