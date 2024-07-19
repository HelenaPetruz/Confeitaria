package com.mentoria.helena.confeitaria.repository;
import com.mentoria.helena.confeitaria.classes.Cliente;

public interface IClienteRepository {

    Cliente get (int idCliente);
    void add (String nome, int idade, String telefone, String cpf);
    void update (Cliente cliente);
    void remove (Cliente cliente);

}
