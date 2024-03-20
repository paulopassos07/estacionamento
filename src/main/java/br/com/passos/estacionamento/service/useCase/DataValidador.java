package br.com.passos.estacionamento.service.useCase;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

public interface DataValidador {

    boolean isEndDateAfterStartDate(LocalDateTime dataEntrada, LocalDateTime dataSaida);

} 