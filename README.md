# Sistema de Controle de Estacionamento com Spring Boot

## Descrição
Este projeto é uma API RESTful para gerenciar um estacionamento. Ele permite operações de CRUD para veículos e registros de estacionamento.

## Tecnologias Utilizadas
- Spring Boot
- Spring Data JPA
- Banco de dados H2 (para simplificar o desenvolvimento e testes)
- Maven

## Funcionalidades
- Adicionar, atualizar, listar e remover veículos do sistema.
- Registrar entrada e saída de veículos.
- Calcular o valor a ser pago com base no tempo de permanência.

## Modelo de Dados
- Veículo (id, placa, marca, modelo, cor)
- Estacionamento (id, veículo, horaEntrada, horaSaida, valor)

## Endpoints da API
- `POST /veiculos` - Adiciona um novo veículo.
- `GET /veiculos` - Lista todos os veículos.
- `GET /veiculos/{id}` - Obtém detalhes de um veículo específico.
- `PUT /veiculos/{id}` - Atualiza um veículo existente.
- `DELETE /veiculos/{id}` - Remove um veículo.

- `POST /estacionamento/entrada` - Registra a entrada de um veículo.
- `POST /estacionamento/saida` - Registra a saída de um veículo e calcula o valor.
- `GET /estacionamento/{id}` - Obtém detalhes de um registro de estacionamento específico.
