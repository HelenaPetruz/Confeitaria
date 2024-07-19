package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Cliente;

import java.util.ArrayList;

public class ClienteRepository implements IClienteRepository{

    ArrayList<Cliente> listaCliente = new ArrayList();

    @Override
    public Cliente get(int idCliente) {
        for (Cliente c: listaCliente){
            if (c.getIdCliente()==idCliente){
                return c;
            }
        }
        return null;
    }

    @Override
    public void add(Cliente cliente) {

    }

    @Override
    public void update(Cliente cliente) {

    }

    @Override
    public void remove(Cliente cliente) {

    }
}
