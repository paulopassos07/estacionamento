package br.com.passos.estacionamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.passos.estacionamento.domain.Estacionamento;
import br.com.passos.estacionamento.repository.EstacionamentoRepository;

@Service
public class EstacionamentoService {

    @Autowired
    private EstacionamentoRepository estacionamentoRepository;

    public Estacionamento adicionar(Estacionamento estacionamento){
        return estacionamentoRepository.save(estacionamento);
    }
    
}
