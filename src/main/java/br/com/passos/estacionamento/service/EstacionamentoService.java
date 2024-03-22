package br.com.passos.estacionamento.service;

import br.com.passos.estacionamento.domain.Vaga;
import br.com.passos.estacionamento.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.passos.estacionamento.domain.Estacionamento;
import br.com.passos.estacionamento.repository.EstacionamentoRepository;
import br.com.passos.estacionamento.service.useCase.DataValidador;

import java.util.Optional;

@Service
public class EstacionamentoService{

    @Autowired
    private EstacionamentoRepository estacionamentoRepository;

    @Autowired
    private VagaRepository vagaRepository;

    @Autowired
    private DataValidador dataValidador;

    public void adicionar(Estacionamento estacionamento){
        dataValidador.isEndDateAfterStartDate(estacionamento.getDataEntrada(), estacionamento.getDataSaida());
        estacionamentoRepository.save(estacionamento);
        vagaAtiva(estacionamento.getId());
    }

    private void vagaAtiva(Long id){
        Optional<Vaga> vaga = vagaRepository.findById(id);
        Vaga vagaAtiva = vaga.get();
        vagaAtiva.setAtiva(true);
        vagaRepository.save(vagaAtiva);
    }

}
