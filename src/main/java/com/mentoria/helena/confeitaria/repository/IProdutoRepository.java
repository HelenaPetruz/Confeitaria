package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Produto;

public interface IProdutoRepository {
    Produto get (int idProduto);
    void add (String descricao, double preco, String categoria, String validade);
    void update (Produto produto);
    void remove (Produto produto);
}
