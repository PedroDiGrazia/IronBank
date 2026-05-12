package com.pedro.bank.bankapi.repository;

import com.pedro.bank.bankapi.domain.Conta; //Importa o modelo de conta
import org.springframework.data.jpa.repository.JpaRepository; //Ferramenta do Spring
import org.springframework.stereotype.Repository; //Utilizado para identificar que é um repositorio

public class ContaRepository {
    @Repository //Diz ao Spring que essa classe cuida do acesso aos dados
    //interface: diferente de uma classe, uma interface no Java define um comportamento.
    //extends JpaRepository<Conta, Long>: Ao estender o JpaRepository, o Spring entende que essa interface deve herdar
    //                                    (ganhar) todas as funcoes basicas de um DB: salvar, deletar, buscar por ID...
    //<Conta, Long>: Esta dizendo ao Spring que quer gerenciar a entidade Conta e o tipo do ID dela é Long
    public interface ContaRepositoryJpa extends JpaRepository<Conta, Long> {}
}
