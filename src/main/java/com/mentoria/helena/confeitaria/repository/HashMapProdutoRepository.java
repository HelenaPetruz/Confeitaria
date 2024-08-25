package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Produto;

import java.util.HashMap;
import java.util.List;

public class HashMapProdutoRepository implements IProdutoRepository{

    HashMap <Integer, Produto> mapa = new HashMap<>();

    @Override
    public Produto get(int idProduto) {
        return mapa.get(idProduto);
    }

    @Override
    public void add(Produto produto) {
        produto.incrementarId();
        mapa.put(produto.getIdProduto(), produto);
    }

    @Override
    public void update(Produto produto) {
        mapa.put(produto.getIdProduto(), produto);
    }

    @Override
    public void remove(Produto produto) {
        mapa.remove(produto.getIdProduto());
    }

    public List<Produto> getList(){
        return mapa.values().stream().toList();
    }
}
