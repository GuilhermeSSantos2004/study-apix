package com.github.guilhermessantos2004.study_apix;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("produtos")

//modulito(++++) /= API(/-/-/) vs microservices(+)

public class ControllerProduto {
    
    @PostMapping
    public ResponseEntity<String> create() {
        return ResponseEntity.status(201).body("Produto cadastro");
    }
  
    @PutMapping
    public ResponseEntity<String> uptade() {
        return ResponseEntity.status(200).body("Produto atualizado");
    }

    @GetMapping
    public ResponseEntity<String> find () {
        return ResponseEntity.status(200).body("maça");
    }

    @DeleteMapping
    public ResponseEntity<Void> delete() {
        return ResponseEntity.status(204).build();
    }
}