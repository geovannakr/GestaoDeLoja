package com.weg.gestaoDeLoja.dto.cliente;

public record ClienteRespostaDTO(
        Long id,
        String nome,
        String email,
        String telefone,
        String cpf
) {
}
