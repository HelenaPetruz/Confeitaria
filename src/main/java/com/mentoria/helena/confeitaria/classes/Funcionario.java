package com.mentoria.helena.confeitaria.classes;

public class Funcionario extends Pessoa {

    protected double salario;
    protected static int id=0;
    protected int idFuncionario;

    public String exibir() {
        String retorno="";
        String titulo = "========== FUNCIONARIO " + idFuncionario +" ==========<br>";
        retorno=retorno.concat(titulo);
        String nomeC = "Nome: "+ nome+ "<br>";
        retorno=retorno.concat(nomeC);
        String telefoneC = "Telefone: "+ telefone + "<br>";
        retorno=retorno.concat(telefoneC);
        String cpfC = "Cpf: "+cpf + "<br>";
        retorno=retorno.concat(cpfC);
        String idadeC = "Idade: "+idade+ "<br>";
        retorno=retorno.concat(idadeC);
        String salarioC = "Salario: "+ salario+ "<br>";
        retorno=retorno.concat(salarioC);
        return retorno;
    }

    public Funcionario(String nome, int idade, String telefone, String cpf, double salario) {
        super(nome, idade, telefone, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario<0){
            throw new SalarioNegativoException();
        }
        else {
            this.salario = salario;
        }
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Funcionario.id = id;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void incrementarId(){
        idFuncionario=++id;
    }

}
