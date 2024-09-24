package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Funcionario;

public interface IFuncionarioRepository {

    Funcionario get (int idFuncionario);
    Funcionario add (Funcionario funcionario);
    void update (Funcionario funcionario);
    void remove (int idFuncionario);

}
