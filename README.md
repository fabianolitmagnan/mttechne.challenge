## 💻 Sobre a Solução

No desafio criei a conjuntura onde a solução considera uma base relacional legada para exemplificar o uso do controle de versão das alterações e evoluções feitas no Banco de Dados aumentando a confiabilidade das implantações. Migrations, ou ferramentas de migrações, para registrar as atualizações no banco de dados. O Flyway, uma dessas ferramentas suportadas pelo Spring Boot. Para cada mudança no banco de dados é criado um arquivo .sql no projeto e, nele, contém o trecho do comando SQL que será executado no banco de dados.
Além de fornecer um mecanismo base para refatoração em microsserviços. Isto é, não é uma solução em microsserviços, mas uma estrutura alicerce neste sentido.
Mais detalhes em: [mttechne.challenge/docs/Mttechne Challenge.pdf;](https://github.com/fabianolitmagnan/mttechne.challenge/blob/main/docs/Mttechne%20Challenge.pdf)

- **seção: Considerações e Controle de Versão da Base de Dados

## ⚙️ Instruções de como subir a aplicação local

- [1] Ter o MySQL instalado na versão 8.0.32, ver: [Guia de Instalação do MySQL.pdf](https://github.com/fabianolitmagnan/mttechne.challenge/blob/main/docs/Guia%20de%20Instala%C3%A7%C3%A3o%20do%20MySQL.pdf)
- [2] Criar username: root com password: root
- [3] No MySQL Command Line criar o database com o comando: create database cashflow_api;
- [4] No Maven (https://maven.apache.org/download.cgi) execute:
-           mvn install
-           mvn spring-boot:run
-           Ou java -jar target/api.cash-flow-0.0.1-SNAPSHOT.jar na linha de comando
- [5] Para verificar se a aplicação está funcionando em qualquer browser acesse: http://localhost:8080/hello
-          Deve aparecer uma página com o texto: Hello World Spring!
- [6] Para incluir um lançamento com o método POST http://localhost:8080/allocated, exemplo:
```JSON
{
 "account" : 123,
 "amount" : 140.9,
 "typed" : "CREDIT"
}
```
- **[7] Para consultar o saldo diário consolidado, método GET http://localhost:8080/allocated

## 📄 Documentação

O desenho da solução e detalhes sobre a implementação estão documentados em: (mttechne.challenge/docs/)

- **[Trello - Mttechne Challenge](https://trello.com/invite/b/hFTIQvJk/ATTI810cf8f7cd34d0e6b71e6179f60a15aeC658EF53/mttechne-challenge) --> Quadro para organização das tarefas.
- **[Mttechne Challenge.pdf](https://github.com/fabianolitmagnan/mttechne.challenge/blob/main/docs/Mttechne%20Challenge.pdf) --> Contém o desenho da solução e detalhes.
- **[Mttechne Challenge.archimate] --> Desenho da solução feito no [Archimate](https://www.archimatetool.com/).
- **[Desenho da Solução - Mttechne Challenge.bmp](https://github.com/fabianolitmagnan/mttechne.challenge/blob/main/docs/Desenho%20da%20Solu%C3%A7%C3%A3o%20-%20Mttechne%20Challenge.bmp) --> Imagem do desenho da solução.
- **[Guia de Instalação do MySQL.pdf](https://github.com/fabianolitmagnan/mttechne.challenge/blob/main/docs/Guia%20de%20Instala%C3%A7%C3%A3o%20do%20MySQL.pdf) --> Guia contendo orientações para a instalação e configuração da base de dados.

## 🛠 Tecnologias

As seguintes tecnologias foram utilizadas no desenvolvimento da solução:

- [Trello](https://trello.com)
- [Java 17](https://www.oracle.com/java)
- [Spring Boot 3](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org)
- [MySQL](https://www.mysql.com)
- [Hibernate](https://hibernate.org)
- [Flyway](https://flywaydb.org)
- [Lombok](https://projectlombok.org)
