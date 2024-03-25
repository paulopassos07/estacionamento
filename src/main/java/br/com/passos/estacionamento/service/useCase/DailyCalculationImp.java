package br.com.passos.estacionamento.service.useCase;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service
public class DailyCalculationImp implements DailyCalculation{

    @Override
    public double calculation(LocalDateTime dateInput, LocalDateTime dateOutput, double valueDate) {
        long secondsDifference = ChronoUnit.SECONDS.between(dateInput, dateOutput);
        double value = (double) secondsDifference /  (24 * 60 * 60);
        return value * valueDate;
    }

}
