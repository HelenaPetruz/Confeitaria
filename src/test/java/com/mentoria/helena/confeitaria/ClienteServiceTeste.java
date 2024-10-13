package com.mentoria.helena.confeitaria;

import com.mentoria.helena.confeitaria.classes.Cliente;
import com.mentoria.helena.confeitaria.classes.Funcionario;
import com.mentoria.helena.confeitaria.repository.HashMapClienteRepository;
import com.mentoria.helena.confeitaria.repository.IClienteRepository;
import com.mentoria.helena.confeitaria.service.ClienteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteServiceTeste {

    ClienteService clienteService;
    IClienteRepository iClienteRepository;

    @BeforeEach
    public void inicializar(){
        iClienteRepository = new HashMapClienteRepository();
        clienteService = new ClienteService(iClienteRepository);
    }

    @Test
    public void clienteMaisVelho(){
        //3A: arrange(ajeitar), criar os dados do teste
        Cliente cliente = new Cliente("Harry Potter", 17, "999999", "9999999");
        Cliente c = clienteService.adicionarCliente(cliente);

        //Act(agir), chama a classe que vai testar
        Cliente clienteMaisVelho = clienteService.clienteMaisVelho();

        //Assert(verificar), verifica resultado da ação
        Assertions.assertEquals(c, clienteMaisVelho);
    }

    @Test
    public void clienteMaisVelho_quandoTemMaisDeUmCliente(){
        //3A: arrange(ajeitar), criar os dados do teste
        Cliente harryPotter = new Cliente("Harry Potter", 17, "999999", "9999999");
        Cliente severusSnape = new Cliente("Severus Snape", 55, "999999", "9999999");
        Cliente hermioneGranger = new Cliente("HermioneGranger", 18, "999999", "9999999");
        Cliente harrySalvo = clienteService.adicionarCliente(harryPotter);
        Cliente snapeSalvo = clienteService.adicionarCliente(severusSnape);
        Cliente hermioneSalva = clienteService.adicionarCliente(hermioneGranger);

        //Act(agir), chama a classe que vai testar
        Cliente clienteMaisVelho = clienteService.clienteMaisVelho();

        //Assert(verificar), verifica resultado da ação
        Assertions.assertEquals(snapeSalvo, clienteMaisVelho);
    }

    @Test
    public void alterarClientePorId(){
        //Como testar métodos que são void??

        //3A: arrange(ajeitar), criar os dados do teste
        Cliente katniss = new Cliente("Katniss", 18, "999999", "999999");

        //Act(agir), chama a classe que vai testar
        //Cliente katnissNova = clienteService.alterarCliente(katniss);

        //Assert(verificar), verifica resultado da ação
        //Assertions.assertEquals(, katnissNova);
    }

}
