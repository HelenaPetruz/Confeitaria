package com.mentoria.helena.confeitaria.classes;

public class Cliente extends Pessoa{
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

    public Cliente(String nome, int idade, String telefone, String cpf) {
        super(nome, idade, telefone, cpf);

    }

    public void incrementarId(){
        idCliente=++id;
    }
}
