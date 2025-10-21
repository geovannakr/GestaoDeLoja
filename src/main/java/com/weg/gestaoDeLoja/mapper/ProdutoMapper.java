package com.weg.gestaoDeLoja.mapper;

import com.weg.gestaoDeLoja.dto.produto.ProdutoRequisicaoDTO;
import com.weg.gestaoDeLoja.dto.produto.ProdutoRespostaDTO;
import com.weg.gestaoDeLoja.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {

    public Produto paraEntidade(ProdutoRequisicaoDTO dto){
        Produto produto = new Produto();
        produto.setNome(dto.nome());
        produto.setDescricao(dto.descricao());
        produto.setPreco(dto.preco());
        produto.setQuantidade(dto.quantidade());
        return produto;
    }

    public ProdutoRespostaDTO paraRespostaDTO(Produto produto){
        return new ProdutoRespostaDTO(produto.getId(), produto.getNome(), produto.getDescricao(), produto.getPreco(), produto.getQuantidade());
    }

    public Produto paraUpdate(ProdutoRequisicaoDTO dto, Produto produto){
        if(!dto.nome().equals(produto.getNome()) && dto.nome() != null){
            produto.setNome(dto.nome());
        }

        if(!dto.descricao().equals(produto.getDescricao()) && dto.descricao() != null){
            produto.setDescricao(dto.descricao());
        }

        if(!dto.preco().equals(produto.getPreco()) && dto.preco() != null){
            produto.setPreco(dto.preco());
        }

        if(dto.quantidade() != produto.getQuantidade() && dto.quantidade() != 0){
            produto.setQuantidade(dto.quantidade());
        }
        return produto;
    }
}
