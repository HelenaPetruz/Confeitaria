package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Cliente;
import com.mentoria.helena.confeitaria.classes.Funcionario;

public interface IFuncionarioRepository {

    Funcionario get (int idFuncionario);
    void add (Funcionario funcionario);
    void update (Funcionario funcionario);
    void remove (Funcionario funcionario);

}
