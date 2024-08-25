package com.mentoria.helena.confeitaria.service;

import com.mentoria.helena.confeitaria.classes.Produto;
import com.mentoria.helena.confeitaria.repository.HashMapProdutoRepository;

import java.util.List;

public class ProdutoService {

    private final HashMapProdutoRepository produtoRepository;
    public ProdutoService(HashMapProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public Produto adicionarProduto (Produto produto){
        return produtoRepository.add(produto);
    }

    public List<Produto> exibirTodos(){
        return produtoRepository.getList();
    }

}
