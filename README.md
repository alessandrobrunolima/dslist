# DSList

Projeto exemplo de uma aplicação backend em Java com Spring Boot para gerenciar jogos e listas de jogos.

## Descrição

Este repositório contém a implementação de um serviço RESTful desenvolvido durante o curso DevSuperior (Java + Spring). A aplicação modela entidades de jogos (`Game`) e listas de jogos (`GameList`), incluindo camadas de entidade, repositório, serviço, DTOs e controladores.

O projeto inclui dados de inicialização em `src/main/resources/import.sql` e perfis de configuração em `application.properties` e `application-test.properties`.

## Tecnologias utilizadas

- Java 17 (ou versão compatível com o projeto)
- Spring Boot
- Spring Data JPA
- Maven (com Maven Wrapper `mvnw`/`mvnw.cmd`)
- Banco de dados embutido para testes (configurado via `application-test.properties`, por exemplo H2)
- Templates estáticos e possivelmente Thymeleaf (pasta `src/main/resources/templates`)
- JUnit para testes automatizados

## Estrutura principal

- `src/main/java` — código-fonte (controllers, services, repositories, entities, dto, projections)
- `src/main/resources` — configurações, SQL de importação e recursos estáticos
- `src/test` — testes automatizados

## Como executar

1. Build e executar com o Maven Wrapper (Linux/macOS):

```bash
./mvnw spring-boot:run
```

2. Ou com Maven instalado:

```bash
mvn spring-boot:run
```

O serviço padrão expõe endpoints REST definidos nos controllers (`GameController` e `GameListController`).

## Testes

Execute os testes com:

```bash
./mvnw test
```

## Observações

- Verifique `src/main/resources/application.properties` e `application-test.properties` para as configurações de banco e porta.
- Este README é um resumo; para detalhes dos endpoints e payloads, consulte os controllers em `src/main/java/com/abl/dslist/controllers`.

---

Se quiser, eu posso adicionar seções com exemplos de endpoints, exemplos de JSON de requisição/resposta ou um diagrama rápido das entidades.
