package com.weg.gestaoDeLoja.mapper;

import com.weg.gestaoDeLoja.dto.fornecedor.FornecedorRequisicaoDTO;
import com.weg.gestaoDeLoja.dto.fornecedor.FornecedorRespostaDTO;
import com.weg.gestaoDeLoja.model.Fornecedor;

public class FornecedorMapper {

    public Fornecedor paraEntidade(FornecedorRequisicaoDTO dto){
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome(dto.nome());
        fornecedor.setCnpj(dto.cnpj());
        fornecedor.setEmail(dto.email());
        fornecedor.setTelefone(dto.telefone());
        return fornecedor;
    }

    public FornecedorRespostaDTO paraRespostaDTO(Fornecedor fornecedor){
        return new FornecedorRespostaDTO(fornecedor.getId(), fornecedor.getNome(), fornecedor.getCnpj(), fornecedor.getEmail(), fornecedor.getTelefone());
    }

    public Fornecedor paraUpdate(FornecedorRequisicaoDTO dto, Fornecedor fornecedor){
        if(!dto.nome().equals(fornecedor.getNome()) && dto.nome() != null){
            fornecedor.setNome(dto.nome());
        }

        if(!dto.cnpj().equals(fornecedor.getCnpj()) && dto.cnpj() != null){
            fornecedor.setCnpj(dto.cnpj());
        }

        if(!dto.email().equals(fornecedor.getEmail()) && dto.email() != null){
            fornecedor.setEmail(dto.email());
        }

        if(!dto.telefone().equals(fornecedor.getTelefone()) && dto.telefone() != null){
            fornecedor.setTelefone(dto.telefone());
        }

        return fornecedor;
    }
}
