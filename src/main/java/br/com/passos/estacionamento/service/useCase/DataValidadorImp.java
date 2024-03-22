package br.com.passos.estacionamento.service.useCase;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import br.com.passos.estacionamento.service.exception.DataInvalidaException;

@Service
public class DataValidadorImp implements DataValidador{

    @Override
    public void isEndDateAfterStartDate(LocalDateTime dataEntrada, LocalDateTime dataSaida) {
        boolean valida = dataEntrada.isAfter(dataSaida);
        if (valida) {
            throw new DataInvalidaException("A data final deve ser posterior à data de início.");
        }
    }
    
}
