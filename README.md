# 🛠️ Oficina de Recuperação WEG - API

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2-brightgreen?style=for-the-badge&logo=springboot)
![H2 Database](https://img.shields.io/badge/H2_Database-2.2-blue?style=for-the-badge)

Esta API REST foi desenvolvida para o gerenciamento de ordens de serviço (OS) em uma oficina de recuperação de equipamentos elétricos. O sistema automatiza o fluxo de trabalho entre professores e alunos, garantindo rastreabilidade desde a entrada do equipamento até o laudo técnico final.

---

## 📌 Funcionalidades Principais

* **Gestão Acadêmica:** Cadastro de turmas, alunos e professores.
* **Abertura de OS:** O professor registra o equipamento, o defeito relatado e escala a equipe de alunos.
* **Registro de Execução:** Durante a manutenção, são registrados os materiais utilizados e o progresso.
* **Encerramento e Laudo:** Geração de laudo técnico detalhado para finalização do conserto.

---

## 🏗️ Arquitetura e Tecnologias

O projeto segue os princípios de **Clean Code** e a separação de responsabilidades em camadas (**Controller, Service, Repository, Model, DTO**):

* **Java 21 (LTS):** Versão estável mais recente.
* **Spring Boot 3:** Framework base da aplicação.
* **Spring Data JPA:** Abstração da camada de persistência.
* **H2 Database:** Banco de dados persistido localmente na pasta `/data`.
* **Lombok:** Redução de código repetitivo (Getters/Setters).
* **DTOs (Records):** Transferência de dados imutável e segura.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
* **JDK 21** ou superior instalado.
* Uma IDE (IntelliJ, VS Code ou Eclipse).

### Passo a Passo
1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/oficina-recuperacao-weg.git](https://github.com/seu-usuario/oficina-recuperacao-weg.git)
    ```
2.  **Entre na pasta:**
    ```bash
    cd oficina-recuperacao-weg
    ```
3.  **Execute a aplicação:**
    ```bash
    ./mvnw spring-boot:run
    ```


## 📖 Documentação da API (Exemplos JSON)

### 1. Criar Ordem de Serviço
**Endpoint:** `POST /ordemServico`

**Request Body:**
```json
{
  "equipamento": "Motor Weg W22 50cv",
  "defeitoRelatorio": "Ruído excessivo e aquecimento no mancal dianteiro.",
  "idProfessor": 1,
  "idAluno": [10, 15, 22],
  "materiais": "Aguardando diagnóstico",
  "laudoTecnico": "Em análise"
}
