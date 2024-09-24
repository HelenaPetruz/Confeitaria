package com.mentoria.helena.confeitaria.controler.dto;

import lombok.Getter;
import lombok.Value;

@Getter
@Value
public class FuncionarioDto {
    int idFuncionario;
    String nome;
    int idade;
    String telefone;
    String cpf;
    double salario;
}
