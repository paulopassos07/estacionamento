package br.com.passos.estacionamento.service.useCase;

import java.time.LocalDateTime;

public interface DataValidador {

    public void isEndDateAfterStartDate(LocalDateTime dataEntrada, LocalDateTime dataSaida);

} 