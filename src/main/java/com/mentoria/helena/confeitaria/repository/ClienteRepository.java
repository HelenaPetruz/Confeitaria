package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Cliente;

import java.util.ArrayList;
import java.util.HashMap;

public class ClienteRepository implements IClienteRepository{

    HashMap <Integer, Cliente> lista = new HashMap<>();

    @Override
    public Cliente get(int idCliente) {
        return lista.get(idCliente);
    }

    @Override
    public void add(String nome, int idade, String telefone, String cpf) {
        Cliente cliente1 = new Cliente(nome,idade,telefone,cpf);
        lista.put(cliente1.getIdCliente(),cliente1);
    }

    @Override
    public void update(Cliente cliente) {
        lista.put(cliente.getIdade(), cliente);
    }

    @Override
    public void remove(Cliente cliente) {
        lista.remove(cliente.getIdCliente());
    }
}
