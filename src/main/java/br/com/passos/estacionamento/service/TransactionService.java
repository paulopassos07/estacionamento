package br.com.passos.estacionamento.service;

import br.com.passos.estacionamento.model.Vacancy;
import br.com.passos.estacionamento.repository.VacancyRepository;
import br.com.passos.estacionamento.service.useCase.DailyCalculation;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.passos.estacionamento.model.Transaction;
import br.com.passos.estacionamento.repository.TransactionRepository;
import br.com.passos.estacionamento.service.useCase.DateValidator;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private VacancyRepository vacancyRepository;

    @Autowired
    private DateValidator dateValidator;

    @Autowired
    private DailyCalculation dailyCalculation;


    public void createTransaction(Transaction transaction){
        dateValidator.isEndDateAfterStartDate(transaction.getDateInput(), transaction.getDateOutput());

        double valueDate = dailyCalculation.calculation(transaction.getDateInput(), transaction.getDateOutput(), transaction.getValueDate());
        transaction.setValueTotal(valueDate);

        transactionRepository.save(transaction);
        activeVacancy(transaction.getId());
    }

    private void activeVacancy(Long id){
        Optional<Vacancy> vacancy = vacancyRepository.findById(id);
        Vacancy activeVacancy = vacancy.get();
        activeVacancy.setActive(true);
        vacancyRepository.save(activeVacancy);
    }

}
