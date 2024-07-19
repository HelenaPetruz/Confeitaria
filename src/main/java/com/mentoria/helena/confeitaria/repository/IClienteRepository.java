package com.mentoria.helena.confeitaria.repository;
import com.mentoria.helena.confeitaria.classes.Cliente;

public interface IClienteRepository {

    Cliente get (int idCliente);
    void add (Cliente cliente);
    void update (Cliente cliente);
    void remove (Cliente cliente);

}
