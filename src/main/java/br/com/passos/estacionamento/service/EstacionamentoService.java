package br.com.passos.estacionamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.passos.estacionamento.domain.Estacionamento;
import br.com.passos.estacionamento.repository.EstacionamentoRepository;
import br.com.passos.estacionamento.service.useCase.DataValidador;

@Service
public class EstacionamentoService{

    @Autowired
    private EstacionamentoRepository estacionamentoRepository;

    @Autowired
    private DataValidador dataValidador;

    public void adicionar(Estacionamento estacionamento){
        
        boolean validarData = dataValidador.isEndDateAfterStartDate(estacionamento.getDataEntrada(), estacionamento.getDataSaida());

        if (validarData == true){
            throw new RuntimeException("Deu merda");
        }
        
        estacionamentoRepository.save(estacionamento);
    }
    
}
