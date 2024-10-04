package com.mentoria.helena.confeitaria.controler.dto;
import lombok.Getter;
import lombok.Value;

@Value
@Getter
public class ClienteDto {
    int idCliente;
    String nome;
    int idade;
    String telefone;
    String cpf;
}
