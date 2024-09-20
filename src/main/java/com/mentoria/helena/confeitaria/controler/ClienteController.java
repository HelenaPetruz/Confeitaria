package com.mentoria.helena.confeitaria.controler;
import com.mentoria.helena.confeitaria.classes.Cliente;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mentoria.helena.confeitaria.controler.dto.ClienteDto;
import com.mentoria.helena.confeitaria.service.ClienteService;

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
    public ResponseEntity<Cliente> adicionarCliente (@RequestBody ClienteDto clienteDto){
        final var cliente = new Cliente(clienteDto.getNome(), clienteDto.getIdade(), clienteDto.getTelefone(), clienteDto.getCpf());
        clienteDto.getCpf();
        Cliente clienteLegal = clienteService.adicionarCliente(cliente);
        return ResponseEntity.ok(clienteLegal);
    }

    @PutMapping
    public void alterarCliente (@RequestBody Cliente cliente){
        clienteService.alterarCliente(cliente);
    }

    @DeleteMapping("/{idCliente}")
    public void removerCliente (@PathVariable("idCliente") int idCliente){
        clienteService.removerCliente(idCliente);
    }

}
