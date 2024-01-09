# Metronomy


**Uma API. Simples. Permite criar, listar, atualizar e deletar tarefas (CRUD).**

## Linguagens e Tecnologias
- Java 17+ 
- Spring Boot
- Spring MVC
- Spring Data JPA
- Mysql


## Práticas Adotadas
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências com Maven
- Testes de Unidade
- Documentação automática do Swagger com a OpenAPI 3


## Rodando
1. Clone o repositório:
<br> ```git clone git@github.com:aa-abnerandrade/metronomy_GerenciaTarefas.git```
2. Abra o diretório em sua IDE. No terminal integrado, execute:
<br>```mvn clean package```
4. Execute a aplicação:
<br> ```java -jar target/todolist-0.0.1-SNAPSHOT.jar```
5. Acesse a API
<br> A API poderá ser acessada em **_localhost:8080_** 
<br> O Swagger poderá ser visualizado em **_localhost:8080/swagger-ui.html_**


## Endpoints

- Criar Tarefa
```cURL 
curl --location 'localhost:8080/todos' \
--header 'Content-Type: application/json' \
--data '{
    "nome":"Exemplo de Tarefa 1",
    "descricao":"Uma descrição para a TTarefa 1",
    "prioridade": 3,
    "realizado": false
}'
```
- Listar Tarefa
```cURL 
curl --location 'localhost:8080/todos'
```
- Atualizar Tarefa
```cURL 
curl --location --request PUT 'localhost:8080/todos' \
--header 'Content-Type: application/json' \
--data '{
    "id": 1,
    "nome": "Exemplo de Tarefa 1",
    "descricao": "Uma melhor descrição para Tarefa 1",
    "prioridade": 5
}'
```
- Deletar Tarefa
```cURL 
curl --location --request DELETE 'localhost:8080/todos/1'£¢
```

## Autoria

Abner Andrade Graduando em Análise e Desenvolvimento de Sistemas, apaixonado por desenvolvimento e eterno aprendiz.

👋🏽 Curtiu? Entre em contato!
<div style="display: flex">
<a href = "https://www.linkedin.com/in/abnerandrade/"><img src="https://img.icons8.com/color/64/null/linkedin-circled--v1.png" target="_blank"></a>
<a href = "https://api.whatsapp.com/send?phone=5521973257039&text=Oi,%20Abner.%20Curti%20tua%20Pokedex.%20%20Vamos%20trabalhar%20juntos?"><img src="https://img.icons8.com/color/64/null/whatsapp--v1.png" target="_blank"></a>
</div>