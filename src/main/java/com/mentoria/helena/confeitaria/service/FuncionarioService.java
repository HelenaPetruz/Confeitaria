package com.mentoria.helena.confeitaria.service;

import com.mentoria.helena.confeitaria.classes.Funcionario;
import com.mentoria.helena.confeitaria.repository.HashMapFuncionarioRepository;
import com.mentoria.helena.confeitaria.repository.IFuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private final IFuncionarioRepository funcionarioRepository;
    public FuncionarioService(IFuncionarioRepository funcionarioRepository){
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

    public void alterarFuncionario (Funcionario funcionario){
        funcionarioRepository.update(funcionario);
    }
}
