package com.pedro.bank.bankapi.domain; //Endereco da classe

import jakarta.persistence.Entity; //Se estiver em cima de uma classe significa que essa classe sera uma tabela no DB
import jakarta.persistence.Id; //Utilizado para identificar qual campo vai ser o ID na tabela
import jakarta.persistence.GeneratedValue; //Utilizado para gerar o ID automaticamente
import jakarta.persistence.GenerationType; //Utilizado para gerar o ID automaticamente

@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GeneratioType define como o ID é gerado, IDENTITY é utilizado para delegar essa responsabilidade para o DB, que utiliza recursos como auto-increment do MySQL
    private Long id;

    private String titular;

    //Construtor sem argumentos: O JPA exige isso para funcionar
    public Conta() {}
}
