package com.mentoria.helena.confeitaria.controler;
import com.mentoria.helena.confeitaria.classes.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/clientes-da-confeitaria")
public class ClienteController {

    ArrayList<Cliente> listaCliente = new ArrayList();
    public void inicializar(){
        Cliente c1 = new Cliente();
        c1.setNome("Mariana");
        c1.setIdade(23);
        c1.setTelefone("99999999");
        c1.setCpf("2222222222");
        Cliente c2 = new Cliente();
        c2.setNome("Carlos");
        c2.setIdade(54);
        c2.setTelefone("99999999");
        c2.setCpf("2222222222");
        Cliente c3 = new Cliente();
        c3.setNome("Sofia");
        c3.setIdade(15);
        c3.setTelefone("99999999");
        c3.setCpf("2222222222");
        Cliente c4 = new Cliente();
        c4.setNome("Max");
        c4.setIdade(45);
        c4.setTelefone("99999999");
        c4.setCpf("2222222222");
        Cliente c5 = new Cliente();
        c5.setNome("Vitor");
        c5.setIdade(78);
        c5.setTelefone("99999999");
        c5.setCpf("2222222222");
        Cliente c6 = new Cliente();
        c6.setNome("Laura");
        c6.setIdade(19);
        c6.setTelefone("99999999");
        c6.setCpf("2222222222");

        listaCliente.add(c1);
        listaCliente.add(c2);
        listaCliente.add(c3);
        listaCliente.add(c4);
        listaCliente.add(c5);
        listaCliente.add(c6);
    }

    public ClienteController() {
        inicializar();
    }

    @GetMapping
    public String exibirTodods(){
        StringBuilder retorno = new StringBuilder("LISTA DE CLIENTES DA CONFEITARIA:<br><br>");
        for (Cliente c : listaCliente){
            retorno.append(c.exibir());
            retorno.append("<br>");
        }
        return retorno.toString();
    }

    @GetMapping("/mais-velho")
    public void clienteMaisVelho() {
        int maiorIdade = 0;
        for (Cliente c : listaCliente) {
            if (c.getIdade() > maiorIdade) {
                maiorIdade = c.getIdade();
            }
        }
        for (Cliente c : listaCliente) {
            if (c.getIdade() == maiorIdade) {
                StringBuilder retorno = new StringBuilder("O cliente mais velho é: <br><br>");
                retorno.append(c.exibir());
            }
        }
    }

}
