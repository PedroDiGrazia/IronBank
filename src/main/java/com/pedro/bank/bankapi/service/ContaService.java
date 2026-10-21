package com.pedro.bank.bankapi.service;

import com.pedro.bank.bankapi.domain.Conta;
import com.pedro.bank.bankapi.domain.StatusConta;
import com.pedro.bank.bankapi.dto.CriarContaRequest;
import com.pedro.bank.bankapi.dto.ContaResponse;
import com.pedro.bank.bankapi.repository.ContaRepository;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

// Aqui é onde é definida a regra de negocio, ele deve receber o pedido, aplica as regras
// manda salvar e da uma resposta, utilizando o @Service
@Service
public class ContaService {
    private final ContaRepository repository;
}