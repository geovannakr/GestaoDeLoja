package com.weg.gestaoDeLoja.dto.categoria;

import jakarta.validation.constraints.NotEmpty;

public record CategoriaRequisicaoDTO(

        @NotEmpty(message = "Nome da categoria inválido!")
        String nome,

        @NotEmpty(message = "Descrição da categoria inválida!")
        String descricao
) {
}
