package br.com.passos.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.passos.estacionamento.domain.Vaga;

public interface VagaRepository extends JpaRepository<Vaga, Long>{   
}