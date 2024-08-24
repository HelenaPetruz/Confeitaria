package com.mentoria.helena.confeitaria.controler;

import com.mentoria.helena.confeitaria.classes.Cliente;
import com.mentoria.helena.confeitaria.classes.Funcionario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios-da-confeitaria")
public class FuncionarioController {



    @GetMapping
    public String exibirTodods(){
        StringBuilder retorno = new StringBuilder("LISTA DE FUNCIONÁRIOS DA CONFEITARIA:<br><br>");
        for (Funcionario f : listaFuncionario){
            retorno.append(f.exibir());
            retorno.append("<br>");
        }
        return retorno.toString();
    }

}
