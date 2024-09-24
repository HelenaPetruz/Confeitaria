package com.mentoria.helena.confeitaria.service;

import com.mentoria.helena.confeitaria.classes.Funcionario;
import com.mentoria.helena.confeitaria.repository.HashMapFuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    public void removerFuncionario(int idFuncionario){
        funcionarioRepository.remove(idFuncionario);
    }
}
