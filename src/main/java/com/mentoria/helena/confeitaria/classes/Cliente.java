package com.mentoria.helena.confeitaria.classes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class Cliente extends Pessoa {
    @JsonIgnore
    protected static int id=0;
    protected int idCliente;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Cliente.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @JsonCreator
    public Cliente(String nome, int idade, String telefone, String cpf) {
        super(nome, idade, telefone, cpf);

    }

    public Cliente() {

    }

    public void incrementarId(){
        idCliente=++id;
    }
}
