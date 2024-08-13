package com.mentoria.helena.confeitaria.controler;
import com.mentoria.helena.confeitaria.classes.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mentoria.helena.confeitaria.service.ClienteService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

            private final ClienteService clienteService;

            public ClienteController(ClienteService clienteService){
                this.clienteService = clienteService;
            }

    @GetMapping
    public ResponseEntity<List<Cliente>> exibirTodods(){
                var lista = clienteService.exibirTodos();
                return ResponseEntity.ok(lista);
    }

    @GetMapping("/mais-velho")
    public ResponseEntity<Cliente> clienteMaisVelho() {
        return ResponseEntity.ok(clienteService.clienteMaisVelho());
    }

    @PostMapping
    public ResponseEntity<Cliente> adicionarCliente (@RequestBody Cliente cliente){
        Cliente clienteLegal = clienteService.adicionarCliente(cliente);
        return ResponseEntity.ok(clienteLegal);
    }

}
