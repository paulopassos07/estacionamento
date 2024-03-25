package br.com.passos.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.passos.estacionamento.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
}
