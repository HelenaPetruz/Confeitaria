package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Funcionario;

import java.util.List;

public interface IFuncionarioRepository {

    Funcionario get (int idFuncionario);
    Funcionario add (Funcionario funcionario);
    void update (Funcionario funcionario);
    void remove (int idFuncionario);
    List<Funcionario> getList ();

}
