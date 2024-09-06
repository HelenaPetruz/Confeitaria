package com.mentoria.helena.confeitaria.classes;

public class Produto {

    protected String descricao;
    protected static int id=0;
    protected int idProduto;
    protected double preco;
    protected String categoria;
    protected String validade;

    public Produto(String descricao, double preco, String categoria, String validade) {
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.validade = validade;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Produto.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco<0){
            throw new PrecoNegativoException();
        }
        else {
            this.preco = preco;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void incrementarId() {
        idProduto = ++id;
    }
}
