package com.mentoria.helena.confeitaria.controler;
import com.mentoria.helena.confeitaria.classes.Produto;
import com.mentoria.helena.confeitaria.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos-da-confeitaria")
public class ProdutoController {

    private final ProdutoService produtoService;
    public ProdutoController(ProdutoService produtoService){
        this.produtoService=produtoService;
    }

    @PostMapping
    public Produto adicionarProduto(Produto produto){
        return produtoService.adicionarProduto(produto);
    }

    @GetMapping
    public List<Produto> exibirTodods(){
        return produtoService.exibirTodos();
    }

}
