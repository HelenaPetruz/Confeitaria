package com.mentoria.helena.confeitaria.repository;
import com.mentoria.helena.confeitaria.classes.Cliente;

import java.util.List;

public interface IClienteRepository {

    Cliente get (int idCliente);
    Cliente add (Cliente cliente);
    void update (Cliente cliente);
    void remove (int idCliente);
    List<Cliente> getList ();

}
