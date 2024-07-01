package com.mentoria.helena.confeitaria.controler;

import com.mentoria.helena.confeitaria.classes.Cliente;
import com.mentoria.helena.confeitaria.classes.Funcionario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
@RequestMapping("/funcionarios-da-confeitaria")
public class FuncionarioController {

    ArrayList<Funcionario> listaFuncionario = new ArrayList();
    public void inicializar(){
        Funcionario f1 = new Funcionario();
        f1.setNome("Pedro Leoni");
        f1.setIdade(46);
        f1.setTelefone("9999999999");
        f1.setCpf("44444444444");
        f1.setSalario(2000);
        Funcionario f2 = new Funcionario();
        f2.setNome("Maria");
        f2.setIdade(35);
        f2.setTelefone("9999999999");
        f2.setCpf("44444444444");
        f2.setSalario(2000);
        Funcionario f3 = new Funcionario();
        f3.setNome("Vanessa");
        f3.setIdade(21);
        f3.setTelefone("9999999999");
        f3.setCpf("44444444444");
        f3.setSalario(2000);
        Funcionario f4 = new Funcionario();
        f4.setNome("Ricardo");
        f4.setIdade(67);
        f4.setTelefone("9999999999");
        f4.setCpf("44444444444");
        f4.setSalario(2000);
        Funcionario f5 = new Funcionario();
        f5.setNome("Manuela");
        f5.setIdade(23);
        f5.setTelefone("9999999999");
        f5.setCpf("44444444444");
        f5.setSalario(2000);
        Funcionario f6 = new Funcionario();
        f6.setNome("Joaquim");
        f6.setIdade(80);
        f6.setTelefone("9999999999");
        f6.setCpf("44444444444");
        f6.setSalario(2000);

        listaFuncionario.add(f1);
        listaFuncionario.add(f2);
        listaFuncionario.add(f3);
        listaFuncionario.add(f4);
        listaFuncionario.add(f5);
        listaFuncionario.add(f6);
    }

    public FuncionarioController() {
        inicializar();
    }

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
