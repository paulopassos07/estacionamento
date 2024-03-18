package br.com.passos.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.passos.estacionamento.domain.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
}
