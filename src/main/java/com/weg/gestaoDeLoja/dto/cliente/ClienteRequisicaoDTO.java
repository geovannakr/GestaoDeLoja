package com.weg.gestaoDeLoja.dto.cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record ClienteRequisicaoDTO(
        @NotEmpty(message = "Nome do cliente inválido!")
        String nome,

        @Email(message = "Formato de e-mail inválido!")
        String email,

        @Size(min = 13, max = 13, message = "Número de caracteres do telefone inválido!")
        String telefone,

        @Size(min = 11, max = 11, message = "Número de caracteres do CPF inválido!")
        String cpf
) {
}
