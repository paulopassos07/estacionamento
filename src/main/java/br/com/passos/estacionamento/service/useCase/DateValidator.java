package br.com.passos.estacionamento.service.useCase;

import java.time.LocalDateTime;

public interface DateValidator {

    public void isEndDateAfterStartDate(LocalDateTime dateInput, LocalDateTime dateOutput);

} 