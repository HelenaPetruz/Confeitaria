package com.mentoria.helena.confeitaria.controler.dto;

import lombok.Getter;
import lombok.Value;

@Getter
@Value
public class ProdutoDto {
    String descricao;
    int idProduto;
    double preco;
    String categoria;
    String validade;
}
