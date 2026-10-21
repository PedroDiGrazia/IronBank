package com.pedro.bank.bankapi.repository;

import com.pedro.bank.bankapi.domain.Conta; //Importa o modelo de conta
import org.springframework.data.jpa.repository.JpaRepository; //Ferramenta do Spring

public interface ContaRepository extends JpaRepository<Conta, Long> {}

