package com.mentoria.helena.confeitaria.controler;

import com.mentoria.helena.confeitaria.classes.Funcionario;
import com.mentoria.helena.confeitaria.classes.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/produtos-da-confeitaria")
public class ProdutoController {

    ArrayList<Produto> listaProduto = new ArrayList();
    public void inicializar() {
        Produto p1 = new Produto();
        p1.setDescricao("Tiramisu");
        p1.setPreco(45.35);
        p1.setCategoria("Doce");
        p1.setValidade("2024");

        Produto p2 = new Produto();
        p2.setDescricao("Palha italiana");
        p2.setPreco(34.10);
        p2.setCategoria("Doce");
        p2.setValidade("2024");

        Produto p3 = new Produto();
        p3.setDescricao("Cupcake");
        p3.setPreco(12.75);
        p3.setCategoria("Doce");
        p3.setValidade("2024");

        Produto p4 = new Produto();
        p4.setDescricao("Bolo de aniversário");
        p4.setPreco(60.45);
        p4.setCategoria("Doce");
        p4.setValidade("2024");

        Produto p5 = new Produto();
        p5.setDescricao("Milkshake de chocolate");
        p5.setPreco(19.89);
        p5.setCategoria("Bebida");
        p5.setValidade("2024");

        Produto p6 = new Produto();
        p6.setDescricao("Milkshake de maracujá");
        p6.setPreco(19.89);
        p6.setCategoria("Bebida");
        p6.setValidade("2024");


        listaProduto.add(p1);
        listaProduto.add(p2);
        listaProduto.add(p3);
        listaProduto.add(p4);
        listaProduto.add(p5);
        listaProduto.add(p6);
    }

    public ProdutoController(){
        inicializar();
    }

    @GetMapping
    public String exibirTodods(){
        StringBuilder retorno = new StringBuilder("LISTA DE PRODUTOS DA CONFEITARIA:<br><br>");
        for (Produto p : listaProduto){
            retorno.append(p.exibir());
            retorno.append("<br>");
        }
        return retorno.toString();
    }

}
