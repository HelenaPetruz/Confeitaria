package com.mentoria.helena.confeitaria.controler;
import com.mentoria.helena.confeitaria.classes.Cliente;
import com.mentoria.helena.confeitaria.classes.Produto;
import com.mentoria.helena.confeitaria.service.ProdutoService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Produto> adicionarProduto(@RequestBody Produto produto){
        Produto p = produtoService.adicionarProduto(produto);
        return ResponseEntity.ok(p);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> exibirTodods(){
        var lista = produtoService.exibirTodos();
        return ResponseEntity.ok(lista);
    }

}
