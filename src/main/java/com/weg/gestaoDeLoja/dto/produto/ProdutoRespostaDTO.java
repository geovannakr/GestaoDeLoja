package com.weg.gestaoDeLoja.dto.produto;

import java.math.BigDecimal;

public record ProdutoRespostaDTO(
        int id,
        String nome,
        String descricao,
        BigDecimal preco
) {
}
