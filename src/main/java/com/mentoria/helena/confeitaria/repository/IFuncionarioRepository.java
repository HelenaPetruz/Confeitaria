package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Cliente;
import com.mentoria.helena.confeitaria.classes.Funcionario;

public interface IFuncionarioRepository {

    Funcionario get (int idFuncionario);
    void add (String nome, int idade, String telefone, String cpf, double salario);
    void update (Funcionario funcionario);
    void remove (Funcionario funcionario);

}
