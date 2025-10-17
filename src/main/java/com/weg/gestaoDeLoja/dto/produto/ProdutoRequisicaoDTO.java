package com.weg.gestaoDeLoja.dto.produto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProdutoRequisicaoDTO(

        @NotEmpty(message = "Nome do produto inválido!")
        String nome,

        @NotEmpty(message = "Descrição do produto inválida!")
        String descricao,

        @NotEmpty
        @Positive(message = "O preço não pode ser negativo!")
        BigDecimal preco,

        @NotEmpty
        @Positive(message = "A quantidade não pode ser menor que 0!")
        int quantidade
) {
}
