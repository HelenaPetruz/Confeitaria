package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Cliente;
import com.mentoria.helena.confeitaria.classes.Funcionario;

import java.util.ArrayList;

public class FuncionarioRepository implements IFuncionarioRepository{
    ArrayList<Funcionario> listaFuncionario = new ArrayList();

    @Override
    public Funcionario get(int idFuncionario) {
        for (Funcionario f: listaFuncionario){
            if (f.getIdFuncionario()==idFuncionario){
                return f;
            }
        }
        return null;
    }

    @Override
    public void add(String nome, int idade, String telefone, String cpf, double salario) {
        Funcionario funcionario1 = new Funcionario(nome, idade, telefone, cpf, salario);
        listaFuncionario.add(funcionario1);
    }

    @Override
    public void update(Funcionario funcionario) {

    }

    @Override
    public void remove(Funcionario funcionario) {
        for (Funcionario f: listaFuncionario){
            if (f==funcionario){
                listaFuncionario.remove(f);
            }
        }
    }
    }

