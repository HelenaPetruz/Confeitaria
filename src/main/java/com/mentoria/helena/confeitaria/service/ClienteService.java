package com.mentoria.helena.confeitaria.service;

import com.mentoria.helena.confeitaria.classes.Cliente;
import com.mentoria.helena.confeitaria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    public Cliente clienteMaisVelho(){
        var lista = clienteRepository.getList();
        int maiorIdade = 0;
        Cliente cliente=null;
        for (Cliente c : lista) {
            if (c.getIdade() > maiorIdade) {
                maiorIdade = c.getIdade();
                cliente= c;
            }
        }
        return cliente;
    }
}
