package com.pedro.bank.bankapi.dto; //Quais campos a API aceita

//Aqui esta presente o contrato esperado na Saida (Como tem que ser a resposta)
import com.pedro.bank.bankapi.domain.StatusConta;
import java.math.BigDecimal;

// É record pois os dados nao podem e nem devem ser modificados
public record ContaResponse (
        Long id,
        String titular,
        String documento,
        BigDecimal saldo,
        StatusConta status
) {}