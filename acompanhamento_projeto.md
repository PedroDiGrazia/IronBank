# Acompanhamento do Projeto Bank API

## Objetivo

Centralizar a evolucao do projeto para registrar:

- o que ja foi construido
- o que ainda falta
- a tarefa atual
- decisoes importantes de arquitetura e implementacao

## Visao Geral

Projeto backend bancario enterprise com foco em aprendizado profundo de:

- Java 17
- Spring Boot 3
- PostgreSQL
- Docker
- RabbitMQ
- JWT / Spring Security
- JUnit 5
- Mockito
- Testcontainers
- Swagger / OpenAPI
- GitHub Actions
- Terraform
- AWS

## Estado Atual

### Ja Existe

- projeto Spring Boot inicializado
- dependencia de Web
- dependencia de Validation
- dependencia de JPA
- dependencia de Security
- dependencia de OpenAPI / Swagger
- dependencia do PostgreSQL
- teste basico de contexto do Spring
- arquivo `application.yaml` com nome da aplicacao

### Falta

- modelagem inicial do dominio
- configuracao real de banco de dados
- migracoes de banco
- entidades e repositorios
- casos de uso de conta
- endpoints REST reais
- tratamento padronizado de erros
- autenticacao JWT
- autorizacao por perfis / regras
- transferencias bancarias
- controle transacional e concorrencia
- processamento assincrono com RabbitMQ
- testes unitarios relevantes
- testes de integracao com banco real
- Testcontainers
- observabilidade
- Dockerfile e docker-compose
- pipeline GitHub Actions
- infraestrutura com Terraform
- estrategia de deploy na AWS

## Secoes do Projeto

### 1. Fundacao e Dominio

**Ja tem**

- esqueleto inicial da aplicacao

**Falta**

- definir entidades principais
- definir invariantes de negocio
- definir fronteiras entre controller, service e dominio
- definir linguagem ubiqua do sistema

### 2. Persistencia e Banco

**Ja tem**

- dependencia do PostgreSQL
- dependencia Spring Data JPA

**Falta**

- configurar conexao com banco
- escolher estrategia de migracao
- mapear entidades corretamente
- definir constraints e indices
- decidir estrategia de versionamento do schema

### 3. API REST

**Ja tem**

- dependencia Spring Web
- Swagger configurado por dependencia

**Falta**

- endpoints iniciais
- DTOs de request e response
- validacoes de entrada
- padronizacao de respostas
- tratamento global de excecoes

### 4. Seguranca

**Ja tem**

- dependencia Spring Security

**Falta**

- definir modelo de autenticacao
- implementar JWT
- configurar filtros e cadeia de seguranca
- definir regras de autorizacao
- testar cenarios autenticados e nao autenticados

### 5. Regras Bancarias

**Ja tem**

- escopo funcional definido em alto nivel

**Falta**

- CRUD de contas
- regras de saldo
- transferencias
- auditoria minima
- idempotencia para operacoes sensiveis
- estrategia contra inconsistencias concorrentes

### 6. Processamento Assincrono

**Ja tem**

- objetivo funcional definido

**Falta**

- configurar RabbitMQ
- modelar eventos ou mensagens
- processar comprovantes assincronamente
- tratar retentativas e falhas

### 7. Testes

**Ja tem**

- starter de testes do Spring
- `spring-security-test`

**Falta**

- testes unitarios de regras de negocio
- testes de controller
- testes de repositorio
- testes de integracao
- Mockito
- Testcontainers
- estrategia de dados de teste

### 8. Observabilidade

**Ja tem**

- nada implementado ainda

**Falta**

- logs estruturados
- metricas
- health checks
- tracing basico
- correlacao de requisicoes

### 9. DevOps e Infra

**Ja tem**

- wrapper Maven

**Falta**

- Dockerfile
- docker-compose para ambiente local
- pipeline CI com GitHub Actions
- Terraform
- definicao da arquitetura AWS

## Tarefa Atual

Modelar a entidade de negocio `Conta` antes de implementar codigo de regra bancaria.

### Entregavel desta etapa

Produzir um rascunho com:

- campos da entidade `Conta`
- invariantes de negocio
- endpoints iniciais do CRUD

### Perguntas que devem guiar esta etapa

- quais dados sao obrigatorios para uma conta existir?
- quais dados devem ser unicos?
- quais estados uma conta pode assumir?
- o saldo pode ser negativo?
- faz sentido separar saldo de limite?
- quais operacoes uma conta pode receber no primeiro incremento?
- o que deve ser proibido desde o inicio?

## Proximos Passos Planejados

1. Revisar o desenho inicial da entidade `Conta`
2. Definir DTOs e casos de uso iniciais
3. Escolher estrategia de persistencia e migracao
4. Implementar CRUD inicial de contas
5. Cobrir regras principais com testes
6. Evoluir para transferencia e concorrencia

## Decisoes Arquiteturais

Use esta secao para registrar decisoes importantes.

### Decisao 001

**Tema**

- ainda nao definido

**Decisao**

- ainda nao definida

**Motivo**

- ainda nao definido

**Consequencias**

- ainda nao definidas
