# 📦 Sistema de Controle de Estoque

Projeto desenvolvido em **Java** para praticar os fundamentos da linguagem através de um sistema simples de gerenciamento de produtos em estoque.

---

## 📖 Sobre o projeto

A aplicação é executada via console e permite ao usuário realizar operações básicas de gerenciamento de produtos utilizando uma lista em memória (`ArrayList`).

Além das operações de cadastro, busca e remoção, o sistema também realiza o cálculo do valor total do estoque com base na quantidade e no preço de cada produto.

Este projeto foi desenvolvido durante meus estudos para a certificação **Oracle Certified Associate (OCA Java)**.

---

## 🚀 Funcionalidades

- 📋 Listar produtos cadastrados
- 🔍 Buscar produto pelo nome
- ➕ Cadastrar novo produto
- ❌ Remover produto
- 💰 Calcular o valor total do estoque

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
- Operações matemáticas
- Manipulação de tipos primitivos (`double` e `int`)

---

## 📂 Estrutura do projeto

```
03-estoque/
│
├── src/
│   └── EstoqueProduto.java
│
└── README.md
```

---

## ▶️ Como executar

Compile o projeto:

```bash
javac src/EstoqueProduto.java
```

Execute:

```bash
java -cp src EstoqueProduto
```

---

## 💻 Exemplo de execução

```
1 - Listar Produtos
2 - Buscar Produto
3 - Cadastrar Produto
4 - Remover Produto
5 - Valor Total do Estoque
```

Exemplo:

```
Digite o nome do Novo Produto:

Notebook

Digite o preço:

4500

Digite a quantidade:

3
```

Resultado:

```
PS4 - 500.0 - 1
XBOX - 600.0 - 2
Notebook - 4500.0 - 3
```

---

## 📚 Tecnologias

- Java
- IntelliJ IDEA

---

## 📌 Produtos cadastrados inicialmente

O sistema inicia com dois produtos cadastrados para facilitar os testes:

| Produto | Preço | Quantidade |
|----------|------:|-----------:|
| PS4 | R$ 500,00 | 1 |
| XBOX | R$ 600,00 | 2 |

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

- Alteração de preço de um produto
- Entrada e saída de estoque
- Controle de estoque mínimo
- Ordenação de produtos por nome ou preço
- Persistência dos dados em banco de dados
- Interface gráfica ou API REST

---

Desenvolvido por **Christian Alves** ☕