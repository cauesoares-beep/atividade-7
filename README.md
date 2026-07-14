# atividade-7
# Mini Sistema de Cadastro de Alunos

## Descrição

Este projeto foi desenvolvido em Java utilizando Programação Orientada a Objetos.

O sistema permite realizar o cadastro de alunos utilizando uma estrutura de dados do tipo Map.

As principais funcionalidades são:

- Cadastrar aluno;
- Pesquisar aluno pela matrícula;
- Remover aluno;
- Salvar os dados em arquivo;
- Recuperar os dados salvos.

A persistência é realizada utilizando serialização de objetos através das classes:

- ObjectOutputStream
- ObjectInputStream

Os alunos implementam a interface Serializable.

O sistema possui uma interface gráfica desenvolvida com Swing (JFrame), contendo menu de operações.

---

## Estrutura do Projeto

```
src
│
├── modelo
│   ├── Aluno.java
│   ├── Sistema.java
│   ├── SistemaMap.java
│   └── GravadorDeDados.java
│
├── controller
│   └── SistemaController.java
│
├── gui
│   ├── FrontEnd.java
│   └── Main.java
│
test
│
└── SistemaMapTest.java
```

---

## Funcionalidades

✔ Cadastro de alunos

✔ Pesquisa de alunos

✔ Remoção de alunos

✔ Persistência em arquivo

✔ Interface gráfica

✔ Testes automatizados

---

## Tecnologias

Java

Swing

JUnit

Serializable

HashMap

ObjectInputStream

ObjectOutputStream

Git

GitHu