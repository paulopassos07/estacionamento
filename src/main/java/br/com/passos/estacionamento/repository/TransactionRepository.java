package br.com.passos.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.passos.estacionamento.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
}