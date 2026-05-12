# Trilha de Estudo Inicial

## Objetivo

Este documento define a trilha de estudo inicial para comecar o projeto com base tecnica suficiente, sem sair criando codigo sem entender:

- o papel de cada camada
- como o Spring organiza a aplicacao
- como receber e validar dados
- como persistir entidades com JPA
- como desenhar endpoints REST com semantica correta

## Escopo Desta Fase

O foco agora nao e:

- RabbitMQ
- JWT
- AWS
- Terraform
- Testcontainers
- concorrencia bancaria profunda

O foco agora e:

- criar conta
- buscar conta por id
- listar contas
- construir a base de modelagem, API e persistencia

## Ordem de Estudo

### 1. Estrutura do codigo no Spring Boot

**Documentacao**

- [Structuring Your Code](https://docs.spring.io/spring-boot/reference/using/structuring-your-code.html)

**Objetivo**

- entender por que a classe principal fica no pacote raiz
- entender por que `controller`, `service`, `repository` e `domain` ficam abaixo dela
- entender como o Spring encontra classes da aplicacao

**Pontos para prestar atencao**

- package Java versus pasta no filesystem
- component scanning
- por que evitar codigo fora do pacote base

### 2. Controllers REST e mapeamento de requisicoes

**Documentacao**

- [Spring Web MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Annotated Controllers](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller.html)
- [Mapping Requests](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-requestmapping.html)
- [@RequestBody](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-methods/requestbody.html)

**Objetivo**

- entender o que faz um `@RestController`
- entender `@GetMapping`, `@PostMapping` e `@PatchMapping`
- entender como o Spring recebe JSON no body da requisicao
- entender diferenca entre rota, body e path variable

**Pontos para prestar atencao**

- verbo HTTP carrega semantica
- endpoint nao deve ser criado por impulso
- controller nao deve virar lugar de regra de negocio

### 3. Validacao de entrada

**Documentacao**

- [Spring MVC Validation](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-validation.html)
- [Jakarta Validation Specification](https://jakarta.ee/specifications/bean-validation/3.1/jakarta-validation-spec-3.1)

**Objetivo**

- entender `@Valid`
- entender anotacoes como `@NotBlank`, `@NotNull`, `@Email`
- entender como o Spring responde a erros de validacao
- entender por que validacao declarativa evita duplicacao

**Pontos para prestar atencao**

- diferenca entre validacao de request e regra de negocio
- quando usar validacao no DTO
- quando uma restricao deve virar regra do dominio

### 4. Entidades JPA

**Documentacao**

- [Jakarta Persistence 3.2](https://jakarta.ee/specifications/persistence/3.2/)
- [Persisting Entities](https://docs.spring.io/spring-data/jpa/reference/jpa/entity-persistence.html)

**Objetivo**

- entender o que e uma `@Entity`
- entender o que faz `@Id`
- entender como o JPA instancia e persiste entidades
- entender por que entity nao e DTO

**Pontos para prestar atencao**

- construtor sem argumentos
- campos persistentes
- identidade da entidade
- cuidado para nao misturar estrutura de banco com contrato HTTP

### 5. Repositorios com Spring Data JPA

**Documentacao**

- [Defining Repository Interfaces](https://docs.spring.io/spring-data/jpa/reference/repositories/definition.html)
- [Spring Data JPA](https://docs.spring.io/spring-data/jpa/reference/jpa.html)

**Objetivo**

- entender o que e um repository
- entender por que `JpaRepository` ou `CrudRepository` resolvem o CRUD inicial
- entender responsabilidade do acesso a dados

**Pontos para prestar atencao**

- repository nao e service
- repository nao deve carregar regra de negocio
- como o Spring gera implementacao automaticamente

### 6. Semantica HTTP

**Documentacao**

- [RFC 9110 - HTTP Semantics](https://www.rfc-editor.org/rfc/rfc9110)

**Objetivo**

- entender quando usar `GET`, `POST` e `PATCH`
- entender por que recurso e operacao precisam estar coerentes
- evitar endpoints mal desenhados

**Pontos para prestar atencao**

- `GET` nao deve alterar estado
- `POST` normalmente cria recurso
- `PATCH` nao deve ser usado de forma vaga sem regra clara

## Conceitos que Voce Deve Saber Explicar

Depois desta trilha, voce deve conseguir explicar com suas palavras:

- o que faz um controller
- o que faz um service
- o que faz um repository
- o que faz um DTO
- o que faz uma entity

## Exercicios Depois da Leitura

### Exercicio 1

Explique com suas palavras:

- o que e pacote base da aplicacao
- por que os pacotes ficam abaixo de `com.pedro.bank.bankapi`

### Exercicio 2

Explique com suas palavras:

- como um `POST /contas` recebe JSON
- qual o papel de `@RequestBody`
- qual o papel de `@Valid`

### Exercicio 3

Explique com suas palavras:

- por que `Conta` nao deve ser o mesmo objeto do request HTTP
- por que `Conta` nao deve carregar tudo que pertence ao cliente

### Exercicio 4

Desenhe no papel ou em texto os primeiros artefatos:

- `Conta`
- `StatusConta`
- `CriarContaRequest`
- `ContaRepository`

## Primeira Meta Pratica

Quando terminar essa trilha, o objetivo e conseguir implementar com consciencia:

- `Conta.java`
- `StatusConta.java`
- `ContaRepository.java`
- `CriarContaRequest.java`
- `ContaResponse.java`
- `ContaService.java`
- `ContaController.java`

## Perguntas de Checagem

Antes de escrever codigo, confirme se consegue responder:

- por que `id` normalmente nao entra no request de criacao?
- por que `saldo` nao deveria ser alterado por um `PATCH /contas/{id}` generico?
- por que `Conta` e `Titular` nao devem ser misturados sem pensar?
- por que controller nao e o lugar principal da regra bancaria?

## Referencias Rapidas

- Spring Boot: [Structuring Your Code](https://docs.spring.io/spring-boot/reference/using/structuring-your-code.html)
- Spring Framework: [Spring Web MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- Spring Framework: [Annotated Controllers](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller.html)
- Spring Framework: [Mapping Requests](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-requestmapping.html)
- Spring Framework: [@RequestBody](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-methods/requestbody.html)
- Spring Framework: [Validation](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-validation.html)
- Spring Data JPA: [JPA](https://docs.spring.io/spring-data/jpa/reference/jpa.html)
- Spring Data JPA: [Persisting Entities](https://docs.spring.io/spring-data/jpa/reference/jpa/entity-persistence.html)
- Spring Data JPA: [Defining Repository Interfaces](https://docs.spring.io/spring-data/jpa/reference/repositories/definition.html)
- Jakarta Persistence: [Specification 3.2](https://jakarta.ee/specifications/persistence/3.2/)
- Jakarta Validation: [Specification 3.1](https://jakarta.ee/specifications/bean-validation/3.1/jakarta-validation-spec-3.1)
- HTTP: [RFC 9110](https://www.rfc-editor.org/rfc/rfc9110)

## Observacoes Importantes

- nao tente aprender tudo de Spring de uma vez
- nao implemente features mais avancadas antes de dominar CRUD, validacao e persistencia
- backend bancario exige base forte em modelagem e consistencia
- pressa aqui normalmente vira retrabalho depois
