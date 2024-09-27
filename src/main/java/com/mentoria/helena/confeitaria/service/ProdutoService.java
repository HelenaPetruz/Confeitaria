package com.mentoria.helena.confeitaria.service;

import com.mentoria.helena.confeitaria.classes.PrecoNegativoException;
import com.mentoria.helena.confeitaria.classes.Produto;
import com.mentoria.helena.confeitaria.repository.HashMapProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProdutoService {

    private final HashMapProdutoRepository produtoRepository;
    public ProdutoService(HashMapProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public Produto adicionarProduto (Produto produto) throws PrecoNegativoException{
            if (produto.getPreco()<0){
                throw new PrecoNegativoException();
            }
        return produtoRepository.add(produto);
    }

    public List<Produto> exibirTodos(){
        return produtoRepository.getList();
    }

    public void removerProduto (int idProduto){
        produtoRepository.remove(idProduto);
    }

    public void alterarProduto (Produto produto){
        produtoRepository.update(produto);
    }

}
