package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Produto;

import java.util.List;

public interface IProdutoRepository {
    Produto get (int idProduto);
    Produto add (Produto produto);
    void update (Produto produto);
    void remove (int idProduto);
    List<Produto> getList ();
}
