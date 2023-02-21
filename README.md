![](https://wsrv.nl/?url=https://avatars.githubusercontent.com/u/125823767?v=4?v=4&w=100&h=100&fit=cover&mask=circle)
# Carteira do Zé<br>![GitHub repo size](https://img.shields.io/github/repo-size/CarteiraDoZe/backEnd_carteiraDoZe?color=green) [![GitHub](https://img.shields.io/github/license/CarteiraDoZe/backEnd_carteiraDoZe)](https://github.com/wagnermor/PowerGreen_BackEnd/blob/main/LICENSE) ![GitHub top language](https://img.shields.io/github/languages/top/CarteiraDoZe/backEnd_carteiraDoZe?color=green)
**Carteira do Zé**<br>*Sua carteira mais inteligente*
# Sobre o projeto

[https://carteiradoze.com.br](https://github.com/CarteiraDoZe/backEnd_carteiraDoZe "Carteira do Zé")

**_Carteira do Zé_** é uma aplicação web de gerenciamento financeiro para entregadores. O seu desenvolvimento ocorreu durante o bootcamp **JAVA FullStack** oferecido por [Generation](https://brazil.generation.org "Site da Generation") e [Zé Delivery](https://www.ze.delivery "Site do Zé Delivery").

A **_Carteira do Zé_** tem como objetivo potencializar o crescimento financeiro de profissionais entregadores, facilitando a gestão de receitas e despesas orientadas à meta de ganho mensal com base na metodologia SMART.


## Fluxo do usuário
####Primeiro acesso
```mermaid
graph TD;
Tela/Principal --> Tela/Meta;
Tela/Principal --> Tela/Login;
Tela/Login --> Tela/Meta;
Tela/Login --> Tela/Cadastro;
Tela/Cadastro --> Tela/Meta;
Tela/Meta --> Tela/Principal;
Tela/Principal --> Seleciona/Movimentação;
```
####Registro de movimentações
```mermaid
graph TD;
Tela/Principal --> Seleciona/Movimentação;
Seleciona/Movimentação --> Tela/Movimentação;
Tela/Movimentação --> Tela/Inserir_valores;
Seleciona/Movimentação --> Tela/Entrega;
Tela/Entrega --> Tela/Inserir_valores;
Tela/Inserir_valores --> Movimentação_concluída;
Tela/Entrega --> Movimentação_concluída;
Movimentação_concluída --> Tela/Principal;
```

## DER - Diagrama Entidade Relacionamento
![DER](./assets/DER.jpeg)

# Tecnologias utilizadas
## Back end &nbsp; ![GitHub language count](https://img.shields.io/github/languages/count/wagnermor/PowerGreen_BackEnd?color=green)

- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Implantação em produção
- MySQL / PostgreSQL (Deploy)

# Padrão semântico de commits
  - ***Fix:*** Usado quando o commit for feito para corrigir um problema no código
  - ***Feat:*** Usado quando tem um novo recurso no código
  - ***New:*** Novos arquivos
  - ***Build:*** Quando foi executado o build da nossa aplicação
  - ***Chore:*** Quando foi adicionada uma nova dependência ou configuração
  - ***Refactor:*** Quando for executada uma refatoração no código
  - ***Docs:*** Usado quando ouver uma mudança na documentação do projeto
  - ***Test:*** Quando foir executado um teste na aplicação

# Colaboradores

| [![Github: Wagner Moreira](https://wsrv.nl/?url=avatars.githubusercontent.com/u/47096330?v=4&w=100&h=100&fit=cover&mask=circle)<br>Wagner Moreira<br>![](https://img.shields.io/github/followers/wagnermor?style=social)](https://github.com/wagnermor) | [![Github: Christian Patrick](https://wsrv.nl/?url=avatars.githubusercontent.com/u/120385278?v=4?v=4&w=100&h=100&fit=cover&mask=circle)<br>Christian Patrick<br>![](https://img.shields.io/github/followers/ChrisPCruz99?style=social)](https://github.com/ChrisPCruz99) | [![Github: William Matheus](https://wsrv.nl/?url=https://avatars.githubusercontent.com/u/119905167?v=4?v=4&w=100&h=100&fit=cover&mask=circle)<br>William Matheus<br>![](https://img.shields.io/github/followers/OWillMatheuz?style=social)](https://github.com/OWillMatheuz) | 
|:---:|:---:|:---:|
