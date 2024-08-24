package com.mentoria.helena.confeitaria.service;

import com.mentoria.helena.confeitaria.classes.Funcionario;
import com.mentoria.helena.confeitaria.repository.HashMapFuncionarioRepository;

import java.util.List;

public class FuncionarioService {

    private final HashMapFuncionarioRepository funcionarioRepository;
    public FuncionarioService(HashMapFuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    public Funcionario adicionarFuncionario(Funcionario funcionario){
        return funcionarioRepository.add(funcionario);
    }

    public List<Funcionario> exibirTodos(){
        return funcionarioRepository.getList();
    }

}
