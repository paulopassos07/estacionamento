package br.com.passos.estacionamento.service.useCase;

import java.time.LocalDateTime;

public interface DailyCalculation {

    public double calculation(LocalDateTime dateInput, LocalDateTime dateOutput, double valueDate);

}
