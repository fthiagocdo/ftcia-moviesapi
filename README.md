<h1 align="center">Ftcia-MovieApi</h1>

<p align="center">Api desenvolvida com Spring Boot para consulta de filmes por nome ou código IMDB. Esta api consome dados disponibilizados por <a href="omdbapi.com" target="_blank">OMDb API</a></p>

### Features

- [x] Consulta por Nome
- [x] Consulta por Código IMDB

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina:
[JDK 11](https://developers.redhat.com/products/openjdk/download) 

Descrevo a execução dos passos utilizando o Visual Studio Code com o plugin Spring Initializr Java Support:
[Visual Studio Code](https://code.visualstudio.com/)  [Spring Initializr Java Support] (https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-spring-initializr)

Caso utilize outro editor, os passos podem ser diferentes.
### Rodando o Back End (servidor)

```bash
# Clone este repositório
$ git clone <https://github.com/fthiagocdo/ftcia-moviesapi>

# Acesse a pasta do projeto no terminal/cmd
$ cd ftcia-moviesapi

# Abra o código fonte no Visual Studio
$ code .

# O Visual Studio pedirá para importar as bibliotecas do projeto
Maven Wrapper is found in this workspace, do you trust it? YES
The workspace contains Java projects. Would you like to import them? YES

# Inicie o servidor [<]

# O servidor iniciará na porta:8080 - acesse <http://localhost:8080/movie/name/{name}> ou <http://localhost:8080/movie/id/{id}>
```
