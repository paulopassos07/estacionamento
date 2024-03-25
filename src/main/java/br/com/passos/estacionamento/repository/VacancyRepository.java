package br.com.passos.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.passos.estacionamento.model.Vacancy;

public interface VacancyRepository extends JpaRepository<Vacancy, Long>{
}