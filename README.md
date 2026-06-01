# 🎵 Aplicação de Músicas e Podcasts em Java

Projeto desenvolvido para praticar os conceitos fundamentais de Programação Orientada a Objetos (POO) em Java através da modelagem de uma plataforma de áudios.

---

## 📖 Sobre o Projeto

A aplicação permite criar e gerenciar músicas e podcasts, registrando reproduções, curtidas e classificações dos conteúdos.

O objetivo principal deste projeto foi consolidar conhecimentos em Orientação a Objetos utilizando Java, aplicando conceitos vistos durante os estudos e desenvolvendo uma estrutura próxima de uma aplicação real.

---

## 🚀 Funcionalidades

- Cadastro de músicas
- Cadastro de podcasts
- Registro de reproduções
- Registro de curtidas
- Sistema de classificação baseado na proporção entre curtidas e reproduções
- Exibição de informações detalhadas dos áudios

---

## 🏗️ Estrutura do Projeto

### Audio

Classe base responsável pelas informações comuns entre músicas e podcasts.

**Atributos:**
- Título
- Duração
- Total de reproduções
- Curtidas

**Métodos:**
- Curtir áudio
- Reproduzir áudio
- Classificar áudio
- Exibir ficha

---

### Musica

Classe que herda de `Audio` e representa uma música.

**Atributos adicionais:**
- Artista
- Álbum
- Gênero

---

### Podcast

Classe que herda de `Audio` e representa um podcast.

**Atributos adicionais:**
- Host
- Descrição

---

## 💡 Conceitos de POO Aplicados

Durante o desenvolvimento foram praticados os seguintes conceitos:

✅ Classes e Objetos

✅ Encapsulamento

✅ Herança

✅ Polimorfismo

✅ Sobrescrita de Métodos (`@Override`)

✅ Getters e Setters

✅ Organização em Pacotes

✅ Regras de Negócio

---

## 🛠️ Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub

---

## 📂 Estrutura de Pacotes

```text
src
│
├── principal
│   ├── Principal.java
│
├── modelos
│   ├── Audio.java
│   ├── Musica.java
│   └── Podcast.java
```

---

## 🎯 Objetivo de Aprendizado

Este projeto foi desenvolvido para consolidar os conhecimentos de Programação Orientada a Objetos em Java antes de avançar para tópicos mais complexos como:

- Collections
- Consumo de APIs
- Persistência de Dados
- Spring Boot
- Desenvolvimento Web
