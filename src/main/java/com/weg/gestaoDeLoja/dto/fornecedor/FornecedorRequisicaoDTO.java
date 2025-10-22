package com.weg.gestaoDeLoja.dto.fornecedor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record FornecedorRequisicaoDTO(
        @NotEmpty(message = "Nome do fornecedor inválido!")
        String nome,

        @Size(min = 14, max = 14, message = "Número de caracteres do CNPJ inválido!")
        String cnpj,

        @Email(message = "Formato de e-mail inválido!")
        String email,

        @Size(min = 13, max = 13, message = "Número de caracteres do telefone inválido!")
        String telefone
) {
}