package com.pedro.bank.bankapi.dto;

import jakarta.validation.constraints.NotBlank; //Quando isso for utilizado diz que o campo nao pode ser vazio

public record CriarContaRequest ( //Record representa dados de forma imutavel
        //Essas sao as informacoes necessarias para abrir uma conta
        @NotBlank String nomeTitular, //Nome do titular como String e nao pode ser vazio
        String documento //Numero de documento como string
) {} //Esse colchete {} é o corpo do record, porem como é apenas uma definicao de contrato ele fica vazio