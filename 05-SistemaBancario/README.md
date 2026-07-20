# 🏦 Sistema Bancário em Java

Projeto desenvolvido para praticar os principais conceitos de Programação Orientada a Objetos (POO) utilizando Java.

O sistema funciona via terminal (console) e permite o gerenciamento de contas bancárias, simulando operações básicas como cadastro de contas, depósitos, saques, transferências e listagem de contas.

---

## 🚀 Funcionalidades

- ✅ Cadastro de Conta Corrente
- ✅ Cadastro de Conta Poupança
- ✅ Depósito
- ✅ Saque
- ✅ Transferência entre contas
- ✅ Listagem de contas cadastradas
- ✅ Validação para contas duplicadas
- ✅ Controle de saldo utilizando `BigDecimal`

---

## 📚 Conceitos aplicados

Durante o desenvolvimento deste projeto foram utilizados diversos conceitos importantes da linguagem Java:

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Herança
- Polimorfismo
- Classes Abstratas
- Enum
- Collections (`ArrayList`)
- Métodos e construtores
- Organização em pacotes
- Scanner para entrada de dados
- Estruturas de decisão (`switch`)
- Estruturas de repetição (`do-while`)
- Boas práticas de separação de responsabilidades

---

## 📂 Estrutura do projeto

```
src
│
├── app
│   └── Main.java
│
├── model
│   ├── Cliente.java
│   ├── Conta.java
│   ├── ContaCorrente.java
│   ├── ContaPoupanca.java
│   └── TipoConta.java
│
├── service
│   └── Banco.java
│
└── exception
```

---

## 💻 Operações disponíveis

Ao executar o programa, o seguinte menu é apresentado:

```
===== BANCO JAVA =====

1 - Criar conta-corrente
2 - Criar conta-poupança
3 - Depositar
4 - Sacar
5 - Transferir
6 - Listar contas
0 - Sair
```

---

## 🔄 Fluxo de funcionamento

### Cadastro

- O usuário informa:
    - Número da conta
    - Nome
    - CPF

O sistema cria um cliente e associa a conta correspondente.

---

### Depósito

O usuário informa:

- Número da conta
- Valor

O sistema localiza a conta e realiza o depósito.

---

### Saque

O usuário informa:

- Número da conta
- Valor

Cada tipo de conta possui sua própria regra de saque.

---

### Transferência

O usuário informa:

- Conta de origem
- Conta de destino
- Valor

O sistema realiza o saque da conta de origem e deposita o valor na conta de destino.

---

## 🛠️ Tecnologias

- Java
- IntelliJ IDEA
- Git
- GitHub

---

## 🎯 Objetivo

Este projeto faz parte da minha jornada de estudos em Java com foco no desenvolvimento Backend.

O principal objetivo foi consolidar conceitos fundamentais da linguagem e da Programação Orientada a Objetos através da implementação de um sistema bancário completo utilizando Java puro, sem frameworks.

---

## 👨‍💻 Autor

Christian Alves

GitHub:
https://github.com/christian-a579