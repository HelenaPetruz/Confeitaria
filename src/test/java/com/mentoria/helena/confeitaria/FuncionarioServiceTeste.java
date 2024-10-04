package com.mentoria.helena.confeitaria;

import com.mentoria.helena.confeitaria.classes.Funcionario;
import com.mentoria.helena.confeitaria.repository.HashMapFuncionarioRepository;
import com.mentoria.helena.confeitaria.repository.IFuncionarioRepository;
import com.mentoria.helena.confeitaria.service.FuncionarioService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class FuncionarioServiceTeste {

    FuncionarioService funcionarioService;
    IFuncionarioRepository iFuncionarioRepository;

    @BeforeEach
    public void inicializar(){
        iFuncionarioRepository = new HashMapFuncionarioRepository();
        funcionarioService = new FuncionarioService(iFuncionarioRepository);
    }

    @Test
    public void adicionarFuncionario(){
        //3A: arrange(ajeitar), criar os dados do teste
        Funcionario funcionario = new Funcionario("julia",18,"111111","11111",2000.00);

        //Act(agir), chama a classe que vai testar
        Funcionario f = funcionarioService.adicionarFuncionario(funcionario);

        //Assert(verificar), verifica resultado da ação
        Assertions.assertEquals(1, f.getIdFuncionario());
    }


}
