package com.picpaysimplificado.repositories;

import com.picpaysimplificado.domain.transaction.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepositoy extends JpaRepository<Transaction, Long> {

}
