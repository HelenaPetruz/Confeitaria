package com.mentoria.helena.confeitaria;

import com.mentoria.helena.confeitaria.classes.Produto;
import com.mentoria.helena.confeitaria.repository.HashMapProdutoRepository;
import com.mentoria.helena.confeitaria.repository.IProdutoRepository;
import com.mentoria.helena.confeitaria.service.ProdutoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProdutoServiceTeste {

    ProdutoService produtoService;
    IProdutoRepository iProdutoRepository;

    @BeforeEach
    public void inicializar(){
        iProdutoRepository = new HashMapProdutoRepository();
        produtoService = new ProdutoService(iProdutoRepository);
    }

    @Test
    public void adicionarProduto(){ //3A: Arrange, Act, Assert
        //3A: arrange(ajeitar), criar os dados do teste
        Produto produto = new Produto("Milkshake", 15, "Bebidas", "2024");

        //Act(agir), chama a classe que vai testar
        Produto p = produtoService.adicionarProduto(produto);

        //Assert(verificar), verifica resultado da ação
        Assertions.assertEquals(1, p.getIdProduto());
    }
}
