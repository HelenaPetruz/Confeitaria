package com.mentoria.helena.confeitaria.controler;

import com.mentoria.helena.confeitaria.classes.Funcionario;
import com.mentoria.helena.confeitaria.service.FuncionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PutMapping("/{idFuncionario}")
    public ResponseEntity<Void> alterarFuncionarioPorId (@PathVariable int idFuncionario, @RequestBody Funcionario funcionario){
        Optional<Funcionario> possivelFuncionario = funcionarioService.buscarPorId(idFuncionario);
        if (possivelFuncionario.isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        funcionario.setIdFuncionario(idFuncionario);
        funcionarioService.alterarFuncionario(funcionario);
        return ResponseEntity.noContent().build();
    }

}
