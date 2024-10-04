package com.mentoria.helena.confeitaria.controler;

import com.mentoria.helena.confeitaria.classes.Funcionario;
import com.mentoria.helena.confeitaria.service.FuncionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;
    public FuncionarioController (FuncionarioService funcionarioService){
        this.funcionarioService = funcionarioService;
    }

    @PostMapping
    public ResponseEntity<Funcionario> adicionarFuncionario(@RequestBody Funcionario funcionario){
        Funcionario f = funcionarioService.adicionarFuncionario(funcionario);
        return ResponseEntity.ok(f);
    }

    @GetMapping
    public ResponseEntity<List<Funcionario>> exibirTodos(){
        var lista = funcionarioService.exibirTodos();
        return ResponseEntity.ok(lista);
    }

    @DeleteMapping("/{idFuncionario}")
    public void removerFuncionario(@PathVariable("idFuncionario") int idFuncionario){
        funcionarioService.removerFuncionario(idFuncionario);
    }

    @PutMapping
    public void alterarFuncionario(@RequestBody Funcionario funcionario){
        funcionarioService.alterarFuncionario(funcionario);
    }

}
