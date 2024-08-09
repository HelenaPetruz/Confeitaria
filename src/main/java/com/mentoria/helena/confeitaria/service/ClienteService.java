package com.mentoria.helena.confeitaria.service;

import com.mentoria.helena.confeitaria.classes.Cliente;
import com.mentoria.helena.confeitaria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public Cliente adicionarCliente(String nome, int idade, String telefone, String cpf){
        return clienteRepository.add(nome, idade, telefone, cpf);
    }

    public List<Cliente> exibirTodos(){
        return clienteRepository.getList();
    }
}
