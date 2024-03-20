package br.com.passos.estacionamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.passos.estacionamento.domain.Estacionamento;
import br.com.passos.estacionamento.service.EstacionamentoService;

@RestController
@RequestMapping("/estacionamento")
public class EstacionamentoController {

    @Autowired
    private EstacionamentoService estacionamentoService;

    @PostMapping
    public ResponseEntity<Void> adicionar(@RequestBody Estacionamento estacionamento){
        estacionamentoService.adicionar(estacionamento);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
}
