package br.com.passos.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.passos.estacionamento.domain.Estacionamento;

public interface EstacionamentoRepository extends JpaRepository<Estacionamento, Long>{
}