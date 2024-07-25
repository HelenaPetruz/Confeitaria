package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Produto;

import java.util.HashMap;

public class ProdutoRepository implements IProdutoRepository{

    HashMap <Integer, Produto> lista = new HashMap<>();

    @Override
    public Produto get(int idProduto) {
        return lista.get(idProduto);
    }

    @Override
    public void add(String descricao, double preco, String categoria, String validade) {
        Produto produto = new Produto(descricao, preco, categoria, validade);
        lista.put(produto.getId(), produto);
    }

    @Override
    public void update(Produto produto) {
        lista.put(produto.getIdProduto(), produto);
    }

    @Override
    public void remove(Produto produto) {
        lista.remove(produto);
    }
}
