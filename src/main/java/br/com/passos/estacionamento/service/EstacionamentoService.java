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
        dataValidador.isEndDateAfterStartDate(estacionamento.getDataEntrada(), estacionamento.getDataSaida());
        estacionamentoRepository.save(estacionamento);
    }

}
