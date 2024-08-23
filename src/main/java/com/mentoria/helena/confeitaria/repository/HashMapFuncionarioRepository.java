package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Funcionario;

import java.util.HashMap;

public class HashMapFuncionarioRepository implements IFuncionarioRepository{

    HashMap <Integer, Funcionario> mapa = new HashMap<>();

    @Override
    public Funcionario get(int idFuncionario) {
        return mapa.get(idFuncionario);
    }

    @Override
    public void add(String nome, int idade, String telefone, String cpf, double salario) {
        Funcionario funcionario = new Funcionario(nome, idade, telefone, cpf, salario);
        mapa.put(funcionario.getIdFuncionario(), funcionario);
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

