package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Produto;

import java.util.HashMap;

public class HashMapProdutoRepository implements IProdutoRepository{

    HashMap <Integer, Produto> mapa = new HashMap<>();

    @Override
    public Produto get(int idProduto) {
        return mapa.get(idProduto);
    }

    @Override
    public void add(String descricao, double preco, String categoria, String validade) {
        Produto produto = new Produto(descricao, preco, categoria, validade);
        mapa.put(produto.getIdProduto(), produto);
    }

    @Override
    public void update(Produto produto) {
        mapa.put(produto.getIdProduto(), produto);
    }

    @Override
    public void remove(int idProduto) {
        mapa.remove(idProduto);
    }
}
