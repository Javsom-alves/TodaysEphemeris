Ephemeris API

API desenvolvida com Spring Boot que permite registrar eventos históricos (efemérides) e fazer perguntas sobre acontecimentos históricos utilizando um LLM local via Ollama.

A aplicação permite:

Registrar eventos históricos manualmente

Listar eventos cadastrados

Fazer perguntas sobre acontecimentos históricos

Receber respostas geradas por um modelo LLM rodando localmente com Ollama

Tecnologias utilizadas

Java 17+

Spring Boot

Spring Web

REST API

Ollama

Llama3

Maven


> Arquitetura

O projeto segue uma estrutura simples baseada em Controller → Service → Model.

Ephemeris
│
├── controller
│   └── HelloController
│
├── service
│   ├── EphemerisService
│   └── EphemerisOllamaService
│
├── model
│   ├── Ephemeris
│   └── EphemerisQuestion
│
├── config
│   └── RestConfig
│
└── EphemerisApplication
