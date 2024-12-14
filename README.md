# Jogo da Forca - Spring Boot

Este é um simples Jogo da Forca desenvolvido com **Spring Boot** e **Thymeleaf** para renderização de páginas HTML. O objetivo do jogo é adivinhar uma palavra secreta, tentando diferentes letras dentro de um número limitado de tentativas.

## Funcionalidades

- O jogo escolhe uma palavra secreta aleatória.
- O jogador tenta adivinhar a palavra, letra por letra.
- O número máximo de tentativas é 6.
- Cada tentativa incorreta reduz as tentativas restantes.
- O jogador ganha quando adivinhar todas as letras da palavra secreta antes de se esgotarem as tentativas.
- A interface é simples, mostrando a palavra com letras ocultas e as tentativas restantes.

## Tecnologias

- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Thymeleaf**: Template engine para renderização de HTML.
- **Maven**: Gerenciamento de dependências e construção do projeto.

## Como rodar o projeto

1. Clone o repositório:

    ```bash
    git clone https://github.com/seu-usuario/jogo-da-forca.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd jogo-da-forca
    ```

3. Compile e execute o projeto utilizando Maven:

    ```bash
    mvn spring-boot:run
    ```

4. Abra o navegador e acesse `http://localhost:8080/game` para jogar.

## Estrutura do Projeto

```plaintext
jogo-da-forca/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── forca/
│   │   │               ├── JogoController.java
│   │   │               ├── Jogo.java
│   │   │               ├── Palavra.java
│   │   ├── resources/
│   │   │   ├── static/
│   │   │   │   └── css/
│   │   │   │       └── style.css
│   │   │   ├── templates/
│   │   │   │   ├── game.html
│   │   │   │   └── error.html
│   │   │   └── application.properties
├── pom.xml
└── README.md



### Explicação dos principais tópicos:

- **Funcionalidades**: Descreve o que o jogo faz, como o jogador pode interagir com ele, e o que o sistema faz durante o jogo.
- **Tecnologias**: Relata as tecnologias utilizadas no desenvolvimento do projeto, como Spring Boot e Thymeleaf.
- **Como rodar o projeto**: Passos detalhados para baixar o repositório, instalar as dependências e executar o projeto localmente.
- **Estrutura do Projeto**: Descrição de como os diretórios e arquivos do projeto estão organizados.
- **Como funciona o Jogo**: Explica como o jogo é gerenciado internamente (controlador, modelos, páginas HTML).
- **Contribuições**: Instruções para quem deseja contribuir com o código.
- **Licença**: Informação sobre a licença do projeto.

Esse **README.md** fornece as instruções básicas para que qualquer pessoa consiga rodar o projeto localmente e entender o que está acontecendo no código.

