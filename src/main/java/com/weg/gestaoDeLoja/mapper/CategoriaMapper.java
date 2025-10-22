package com.weg.gestaoDeLoja.mapper;

import com.weg.gestaoDeLoja.dto.categoria.CategoriaRequisicaoDTO;
import com.weg.gestaoDeLoja.dto.categoria.CategoriaRespostaDTO;
import com.weg.gestaoDeLoja.model.Categoria;

public class CategoriaMapper {

    public Categoria paraEntidade(CategoriaRequisicaoDTO dto){
        Categoria categoria = new Categoria();
        categoria.setNome(dto.nome());
        categoria.setDescricao(dto.descricao());
        return categoria;
    }

    public CategoriaRespostaDTO paraRespostaDTO(Categoria categoria){
        return new CategoriaRespostaDTO(categoria.getId(), categoria.getNome(), categoria.getDescricao());
    }

    public Categoria paraUpdate (Categoria categoria, CategoriaRequisicaoDTO dto){

        if(!dto.nome().equals(categoria.getNome()) && dto.nome() != null){
            categoria.setNome(dto.nome());
        }

        if(!dto.descricao().equals(categoria.getDescricao()) && dto.descricao() != null){
            categoria.setDescricao(dto.descricao());
        }

        return categoria;
    }
}
