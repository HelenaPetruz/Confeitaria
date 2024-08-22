package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Cliente;
import com.mentoria.helena.confeitaria.classes.Funcionario;

import java.util.ArrayList;
import java.util.HashMap;

public class FuncionarioRepository implements IFuncionarioRepository{

    HashMap <Integer, Funcionario> mapa = new HashMap<>();

    @Override
    public Funcionario get(int idFuncionario) {
        return mapa.get(idFuncionario);
    }

    @Override
    public void add(String nome, int idade, String telefone, String cpf, double salario) {
        Funcionario funcionario1 = new Funcionario(nome, idade, telefone, cpf, salario);
        mapa.put(funcionario1.getIdFuncionario(), funcionario1);
    }

    @Override
    public void update(Funcionario funcionario) {
        mapa.put(funcionario.getIdFuncionario(), funcionario);
    }

    @Override
    public void remove(Funcionario funcionario) {
        mapa.remove(funcionario);
    }

    }

