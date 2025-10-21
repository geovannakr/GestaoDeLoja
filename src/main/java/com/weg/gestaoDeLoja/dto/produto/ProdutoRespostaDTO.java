package com.weg.gestaoDeLoja.dto.produto;

import java.math.BigDecimal;

public record ProdutoRespostaDTO(
        Long id,
        String nome,
        String descricao,
        BigDecimal preco,
        int quantidade
) {
}
