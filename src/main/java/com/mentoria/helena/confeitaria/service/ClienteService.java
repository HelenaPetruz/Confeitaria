package com.mentoria.helena.confeitaria.service;

import com.mentoria.helena.confeitaria.classes.Cliente;
import com.mentoria.helena.confeitaria.repository.HashMapClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ClienteService {

    private final HashMapClienteRepository clienteRepository;

    public ClienteService(HashMapClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public Cliente adicionarCliente(Cliente cliente){
        return clienteRepository.add(cliente);
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

    public Cliente alterarCliente(Cliente cliente){
        var lista = clienteRepository.getList();
        for (Cliente c: lista){
            if(c.getIdCliente() == cliente.getIdCliente()){
                if (!Objects.equals(cliente.getNome(), c.getNome())){
                    c.getNome() = cliente.getNome();
                }

            }
        }

    }
}
