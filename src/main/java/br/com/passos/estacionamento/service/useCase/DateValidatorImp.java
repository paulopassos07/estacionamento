package br.com.passos.estacionamento.service.useCase;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import br.com.passos.estacionamento.service.exception.DateValidatorException;

@Service
public class DateValidatorImp implements DateValidator {

    @Override
    public void isEndDateAfterStartDate(LocalDateTime dateInput, LocalDateTime dateOutput) {
        boolean validate = dateInput.isAfter(dateOutput);
        if (validate) {
            throw new DateValidatorException("The end date must be later than the start date.");
        }
    }
    
}
