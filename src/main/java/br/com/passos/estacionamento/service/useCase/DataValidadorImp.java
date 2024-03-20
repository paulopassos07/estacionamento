package br.com.passos.estacionamento.service.useCase;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class DataValidadorImp implements DataValidador{

    @Override
    public boolean isEndDateAfterStartDate(LocalDateTime dataEntrada, LocalDateTime dataSaida) {
        boolean valida = dataEntrada.isAfter(dataSaida);
        return valida;
    }
    
}
