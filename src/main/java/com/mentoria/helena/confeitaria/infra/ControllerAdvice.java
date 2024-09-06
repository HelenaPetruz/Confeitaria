package com.mentoria.helena.confeitaria.infra;

import com.mentoria.helena.confeitaria.classes.PrecoNegativoException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(PrecoNegativoException.class)
    public ResponseEntity<String> tratarPrecoNegativo(PrecoNegativoException precoNegativoException){
        return ResponseEntity.status(400).body("Preço negativo!");
    }
}
