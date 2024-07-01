package com.mentoria.helena.confeitaria.classes;

public class Produto {

    protected String descricao;
    protected static int id=0;
    protected int idProduto;
    protected double preco;
    protected String categoria;
    protected String validade;



    public void cadastrarProduto (){
        //tratamento de exeção para validar campos.
    }

    public void removerProduto (){
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String exibir() {
        String retorno="";
        String titulo = "========== PRODUTO " + getIdProduto() +" ==========<br>";
        retorno=retorno.concat(titulo);
        String descricaoC = "Descrição: "+ getDescricao()+ "<br>";
        retorno=retorno.concat(descricaoC);
        String precoC = "Preço: "+getPreco()+ "<br>";
        retorno=retorno.concat(precoC);
        String categoriaC = "Categoria: "+ getCategoria() + "<br>";
        retorno=retorno.concat(categoriaC);
        String validadeC = "Validade: "+getValidade() + "<br>";
        retorno=retorno.concat(validadeC);
        return retorno;
    }

    public Produto() {
        id++;
        idProduto = id;
    }

    public Produto(String descricao, double preco, String categoria, String validade) {
        this.descricao = descricao;
        id++;
        if (preco<0){
            throw new PrecoNegativoException();
        }
        else {
            this.preco = preco;
        }
        this.categoria = categoria;
        this.validade = validade;
        this.idProduto = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
