package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Produto;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
@Repository
public class HashMapProdutoRepository implements IProdutoRepository{

    HashMap <Integer, Produto>
            mapa = new HashMap<>();

    @Override
    public Produto get(int idProduto) {
        return mapa.get(idProduto);
    }

    @Override
    public Produto add(Produto produto) {
        produto.incrementarId();
        mapa.put(produto.getIdProduto(), produto);
        return produto;
    }

    @Override
    public void update(Produto produto) {
        mapa.put(produto.getIdProduto(), produto);
    }

    @Override
    public void remove(int idProduto) {
        mapa.remove(idProduto);
    }

    public List<Produto> getList(){
        return mapa.values().stream().toList();
    }
}
