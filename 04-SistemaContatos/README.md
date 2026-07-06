# 📒 Sistema de Agenda de Contatos

Projeto desenvolvido em **Java** para praticar os fundamentos da linguagem através de um sistema simples de gerenciamento de contatos.

---

## 📖 Sobre o projeto

A aplicação é executada via console e permite ao usuário realizar operações básicas de gerenciamento de contatos utilizando uma lista em memória (`ArrayList`).

O sistema permite cadastrar, buscar, listar e remover contatos, simulando o funcionamento de uma agenda telefônica simples.

Este projeto foi desenvolvido durante meus estudos para a certificação **Oracle Certified Associate (OCA Java)**.

---

## 🚀 Funcionalidades

- 📋 Listar contatos
- 🔍 Buscar contato pelo nome
- ➕ Cadastrar novo contato
- ❌ Remover contato

---

## 🛠️ Conceitos praticados

Durante o desenvolvimento deste projeto foram utilizados os seguintes conceitos de Java:

- Classes e Objetos
- Métodos
- Métodos estáticos
- ArrayList
- Scanner
- Estruturas condicionais (`if` / `else`)
- Laços de repetição (`for`)
- Manipulação de listas
- Busca de objetos
- Remoção de elementos de uma coleção

---

## 📂 Estrutura do projeto

```
04-agenda-contatos/
│
├── src/
│   └── AgendaContatos.java
│
└── README.md
```

---

## ▶️ Como executar

Compile o projeto:

```bash
javac src/AgendaContatos.java
```

Execute:

```bash
java -cp src AgendaContatos
```

---

## 💻 Exemplo de execução

```
1 - Listar Contatos
2 - Buscar Contato
3 - Cadastrar Contato
4 - Remover Contato
```

Exemplo:

```
Digite o nome:

Christian

Digite o telefone:

(11) 99999-9999
```

Resultado:

```
Christian - (11) 99999-9999
Elaine - (11) 98888-8888
```

---

## 📚 Tecnologias

- Java
- IntelliJ IDEA

---

## 📌 Contatos cadastrados inicialmente

O sistema inicia com dois contatos cadastrados para facilitar os testes:

| Nome | Telefone |
|------|-----------|
| Christian | (11) 93312-0723 |
| Elaine | (11) 93458-2734 |

---

## 🎯 Objetivo

Este projeto faz parte da minha jornada de estudos em Java, com foco na construção de uma base sólida em Programação Orientada a Objetos e preparação para o desenvolvimento de aplicações utilizando Spring Boot.

Ao longo dos estudos este projeto poderá receber melhorias, como:

- Encapsulamento
- Construtores
- Collections mais avançadas
- Tratamento de exceções
- Persistência em arquivos
- Banco de dados com JDBC
- API REST utilizando Spring Boot

---

## 📈 Próximas melhorias

Algumas funcionalidades que poderão ser adicionadas futuramente:

- Atualizar telefone de um contato
- Buscar contatos por parte do nome
- Ordenar contatos em ordem alfabética
- Validar telefone
- Impedir contatos duplicados
- Persistência em arquivo
- Integração com banco de dados

---

Desenvolvido por **Christian Alves** ☕