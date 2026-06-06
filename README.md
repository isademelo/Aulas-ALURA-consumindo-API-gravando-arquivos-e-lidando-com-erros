# 📚 Java: Consumo de APIs, JSON e Manipulação de Arquivos

Projeto desenvolvido durante os estudos de integração com APIs em Java, abordando comunicação HTTP, manipulação de dados JSON, serialização de objetos e persistência de informações em arquivos.

---

## 🚀 Sobre o Projeto

Este repositório reúne exercícios e projetos desenvolvidos ao longo do curso, com foco na utilização de recursos modernos do Java para consumir APIs, processar respostas em JSON e armazenar informações localmente.

---

## 🎯 Objetivos de Aprendizagem

Durante o curso foram explorados os seguintes conceitos:

- Consumo de APIs HTTP utilizando Java.
- Criação de requisições e recebimento de respostas.
- Manipulação de dados no formato JSON.
- Conversão entre JSON e objetos Java.
- Utilização da biblioteca Gson.
- Leitura e escrita de arquivos.
- Tratamento de exceções.
- Organização e modularização do código.

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- API HTTP Nativa (`java.net.http`)
- Gson
- Java IO (`java.io`)
- IntelliJ IDEA

---

## 📖 Conteúdos Estudados

### 🌐 Consumo de APIs

Utilização das principais classes da API HTTP do Java:

- `HttpClient`
- `HttpRequest`
- `HttpResponse`
- `URI`

Essas classes permitem realizar requisições para serviços externos e consumir informações disponibilizadas por APIs REST.

---

### 📦 Manipulação de JSON

Processamento dos dados recebidos das APIs em formato JSON.

Principais operações realizadas:

- Leitura de JSON
- Conversão JSON → Objeto Java
- Conversão Objeto Java → JSON
- Mapeamento de atributos

---

### 🔄 Gson

Utilização da biblioteca Gson para serialização e desserialização de objetos.

Exemplos:

```java
Gson gson = new Gson();
```

```java
String json = gson.toJson(objeto);
```

```java
MeuObjeto objeto = gson.fromJson(json, MeuObjeto.class);
```

---

### 💾 Manipulação de Arquivos

Utilização das classes do pacote `java.io` para persistência de dados.

Operações praticadas:

- Criação de arquivos
- Escrita de conteúdo
- Leitura de informações
- Salvamento de dados processados

---

## 📚 Conceitos Desenvolvidos

- Programação Orientada a Objetos
- Consumo de APIs REST
- Comunicação HTTP
- JSON
- Serialização e Desserialização
- Tratamento de Exceções
- Manipulação de Arquivos
- Modularização de Código
- Boas Práticas de Programação

---

## 🔄 Fluxo Geral das Aplicações

```text
Usuário
    ↓
Entrada de dados
    ↓
Requisição HTTP
    ↓
API Externa
    ↓
Resposta em JSON
    ↓
Conversão para Objetos Java
    ↓
Processamento dos Dados
    ↓
Exibição ou Armazenamento
```

---

## 🎓 Aprendizados

Ao final deste curso, fui capaz de:

- Consumir APIs REST utilizando Java.
- Trabalhar com respostas HTTP.
- Manipular dados em formato JSON.
- Utilizar a biblioteca Gson para conversão de dados.
- Persistir informações em arquivos.
- Estruturar aplicações utilizando boas práticas de programação.

---

## 👨‍💻 Autor

Desenvolvido durante os estudos de Java e integração com APIs.
