package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Cliente;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class HashMapClienteRepository implements IClienteRepository{

    HashMap <Integer, Cliente> mapa = new HashMap<>();

    @Override
    public Cliente get(int idCliente) {
        return mapa.get(idCliente);
    }

    @Override
    public Cliente add(Cliente cliente) {
        cliente.incrementarId();
        mapa.put(cliente.getIdCliente(), cliente);
        return cliente;
    }

    @Override
    public void update(Cliente cliente) {
        mapa.put(cliente.getIdCliente(), cliente);
    }

    @Override
    public void remove(int idCliente) {
        mapa.remove(idCliente);
    }

    @Override
    public List<Cliente> getList() {
        return mapa.values().stream().toList();
    }


}
