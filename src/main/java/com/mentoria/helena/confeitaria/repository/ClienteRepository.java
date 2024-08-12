package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Cliente;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class ClienteRepository implements IClienteRepository{

    HashMap <Integer, Cliente> mapa = new HashMap<>();

    @Override
    public Cliente get(int idCliente) {
        return mapa.get(idCliente);
    }

    @Override
    public Cliente add(String nome, int idade, String telefone, String cpf) {
        int id=0;
        Cliente cliente1 = new Cliente(nome,idade,telefone,cpf);
        mapa.put(cliente1.getIdCliente(),cliente1);
        return cliente1;
    }

    @Override
    public void update(Cliente cliente) {
        mapa.put(cliente.getIdade(), cliente);
    }

    @Override
    public void remove(Cliente cliente) {
        mapa.remove(cliente.getIdCliente());
    }

    @Override
    public List<Cliente> getList() {

        return mapa.values().stream().toList();
    }


}
