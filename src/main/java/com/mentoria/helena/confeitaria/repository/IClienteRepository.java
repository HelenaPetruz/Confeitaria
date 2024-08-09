package com.mentoria.helena.confeitaria.repository;
import com.mentoria.helena.confeitaria.classes.Cliente;

import java.util.List;

public interface IClienteRepository {

    Cliente get (int idCliente);
    Cliente add (String nome, int idade, String telefone, String cpf);
    void update (Cliente cliente);
    void remove (Cliente cliente);
    List<Cliente> getList ();

}
