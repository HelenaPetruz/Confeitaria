package com.mentoria.helena.confeitaria.controler;
import com.mentoria.helena.confeitaria.classes.Produto;
import com.mentoria.helena.confeitaria.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;
    public ProdutoController(ProdutoService produtoService){
        this.produtoService=produtoService;
    }

    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto){
        return produtoService.adicionarProduto(produto);
    }

    @GetMapping
    public List<Produto> exibirTodods(){
        return produtoService.exibirTodos();
    }

}
