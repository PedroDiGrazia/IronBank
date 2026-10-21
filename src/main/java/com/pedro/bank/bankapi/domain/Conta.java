package com.pedro.bank.bankapi.domain; //Endereco da classe

import jakarta.persistence.Entity; //Se estiver em cima de uma classe significa que essa classe sera uma tabela no DB
import jakarta.persistence.Id; //Utilizado para identificar qual campo vai ser o ID na tabela
import jakarta.persistence.GeneratedValue; //Utilizado para gerar o ID automaticamente
import jakarta.persistence.GenerationType; //Utilizado para gerar o ID automaticamente
import java.math.BigDecimal;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GeneratioType define como o ID é gerado, IDENTITY é utilizado para delegar essa responsabilidade para o DB, que utiliza recursos como auto-increment do MySQL
    private Long id;
    private String titular;
    private BigDecimal saldo;
    private String documento;
    @Enumerated(EnumType.STRING)
    private StatusConta status;

    //Construtor sem argumentos: O JPA exige isso para funcionar
    protected Conta() {}

    public Conta(String titular, String documento) {
        this.titular = titular;
        this.documento = documento;
        this.saldo = BigDecimal.ZERO;
        this.status = StatusConta.ATIVA;
    }

    public Long getId() {
        return id;
    }
    public String getTitular() {
        return titular;
    }
    public BigDecimal getSaldo() {
        return saldo;
    }
    public String getDocumento() {
        return documento;
    }
    public StatusConta getStatus() {
        return status;
    }
}
