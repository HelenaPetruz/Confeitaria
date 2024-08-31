package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Funcionario;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
@Repository
public class HashMapFuncionarioRepository implements IFuncionarioRepository{

    HashMap <Integer, Funcionario> mapa = new HashMap<>();

    @Override
    public Funcionario get(int idFuncionario) {
        return mapa.get(idFuncionario);
    }

    @Override
    public Funcionario add(Funcionario funcionario) {
        funcionario.incrementarId();
        mapa.put(funcionario.getIdFuncionario(), funcionario);
        return funcionario;
    }

    @Override
    public void update(Funcionario funcionario) {
        mapa.put(funcionario.getIdFuncionario(), funcionario);
    }

    @Override
    public void remove(Funcionario funcionario) {
        mapa.remove(funcionario.getIdFuncionario());
    }

    public List<Funcionario> getList(){
        return mapa.values().stream().toList();
    }

    }

