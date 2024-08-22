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

    public Cliente (Cliente cliente){

    }

    public String exibir() {
        String retorno="";
        String titulo = "========== CLIENTE " + idCliente +" ==========<br>";
        retorno=retorno.concat(titulo);
        String nomeC = "Nome: "+ nome+ "<br>";
        retorno=retorno.concat(nomeC);
        String idadeC = "Idade: "+idade+ "<br>";
        retorno=retorno.concat(idadeC);
        String telefoneC = "Telefone: "+ telefone + "<br>";
        retorno=retorno.concat(telefoneC);
        String cpfC = "Cpf: "+cpf + "<br>";
        retorno=retorno.concat(cpfC);
        return retorno;
    }
}
