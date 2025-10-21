package com.weg.gestaoDeLoja.mapper;

import com.weg.gestaoDeLoja.dto.cliente.ClienteRequisicaoDTO;
import com.weg.gestaoDeLoja.dto.cliente.ClienteRespostaDTO;
import com.weg.gestaoDeLoja.model.Cliente;

public class ClienteMapper {

    public Cliente paraEntidade(ClienteRequisicaoDTO dto){
        Cliente cliente = new Cliente();
        cliente.setNome(dto.nome());
        cliente.setEmail(dto.email());
        cliente.setTelefone(dto.telefone());
        cliente.setCpf(dto.cpf());
        return cliente;
    }

    public ClienteRespostaDTO paraRespostaDTO(Cliente cliente){
        return new ClienteRespostaDTO(cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getTelefone(), cliente.getCpf());
    }

    public Cliente paraUpdate(ClienteRequisicaoDTO dto, Cliente cliente){
        if(!dto.nome().equals(cliente.getNome()) && dto.nome() != null){
            cliente.setNome(dto.nome());
        }

        if(!dto.email().equals(cliente.getEmail()) && dto.email() != null){
            cliente.setEmail(dto.email());
        }

        if(!dto.telefone().equals(cliente.getTelefone()) &&dto.telefone() != null){
            cliente.setTelefone(dto.telefone());
        }

        if(!dto.cpf().equals(cliente.getCpf()) && dto.cpf() != null){
            cliente.setCpf(dto.cpf());
        }

        return cliente;
    }
}
