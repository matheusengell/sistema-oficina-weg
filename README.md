# 🛠️ Sistema de Oficina de Recuperação - WEG

Este projeto é uma API REST desenvolvida em **Java Spring Boot** para o gerenciamento de ordens de serviço (OS) em uma oficina de recuperação de equipamentos. O sistema permite o controle completo desde a sinalização do defeito até a entrega do equipamento consertado.

## 🚀 Funcionalidades Principais

* **Gestão de Turmas:** Cadastro de turmas para organizar os alunos.
* **Gestão de Alunos:** Cadastro de alunos vinculados a turmas específicas.
* **Gestão de Professores:** Cadastro de professores responsáveis pela abertura e supervisão das ordens.
* **Ciclo de Vida da OS:**
    * **Abertura:** O professor registra o equipamento, o defeito e escala os alunos.
    * **Execução:** Os alunos registram materiais utilizados e o laudo técnico do que foi feito.
    * **Listagem:** Consulta centralizada de todas as manutenções em andamento ou concluídas.

---

## 🏗️ Arquitetura e Tecnologias

O projeto foi construído seguindo os princípios de **Clean Code** e a arquitetura em camadas (Controller, Service, Repository, Model, DTO):

* **Java 21**
* **Spring Boot 3**
* **Spring Data JPA**: Persistência de dados simplificada.
* **H2 Database**: Banco de dados persistente em arquivo local.
* **Lombok**: Para redução de código repetitivo.
* **DTOs (Records)**: Para transferência segura de dados entre camadas.

---

## 🔧 Como Rodar o Projeto

### 1. Pré-requisitos
* Ter o **JDK 17** ou superior instalado.
* Uma IDE (IntelliJ, Eclipse ou VS Code).

### 2. Configuração do Banco de Dados (H2)
O projeto salva os dados automaticamente em uma pasta chamada `/data` na raiz do projeto. 
* **Console do Banco:** [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
* **JDBC URL:**
