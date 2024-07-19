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
    public void add(String nome, int idade, String telefone, String cpf) {
        Cliente cliente1 = new Cliente(nome,idade,telefone,cpf);
        listaCliente.add(cliente1);
    }

    @Override
    public void update(Cliente cliente) {

    }

    @Override
    public void remove(Cliente cliente) {
        for (Cliente c: listaCliente){
            if (c==cliente){
                listaCliente.remove(c);
            }
        }
    }
}
