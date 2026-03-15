# Modelagem e Diagramação de um Componente iPhone

## Descrição

Este projeto foi desenvolvido em Java com o objetivo de representar, de forma simples, algumas das principais funcionalidades do iPhone apresentadas no lançamento de 2007.

A proposta do desafio é modelar e diagramar o componente **iPhone**, considerando três funcionalidades principais:

- Reprodutor Musical
- Aparelho Telefônico
- Navegador na Internet

Para isso, foram criadas interfaces para separar melhor cada conjunto de responsabilidades, e uma classe `IPhone` foi implementada para reunir todas essas funcionalidades em um único componente.

Com este exercício, foi possível praticar conceitos iniciais de **Programação Orientada a Objetos**, como:

- interfaces
- implementação de métodos
- organização de classes
- estruturação de projeto em Java

---

## Funcionalidades modeladas

### Reprodutor Musical
Métodos:
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

### Aparelho Telefônico
Métodos:
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### Navegador na Internet
Métodos:
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

---

## Diagrama UML

```mermaid
classDiagram

class ReprodutorMusical {
  <<interface>>
  +tocar()
  +pausar()
  +selecionarMusica(String musica)
}

class AparelhoTelefonico {
  <<interface>>
  +ligar(String numero)
  +atender()
  +iniciarCorreioVoz()
}

class NavegadorInternet {
  <<interface>>
  +exibirPagina(String url)
  +adicionarNovaAba()
  +atualizarPagina()
}

class IPhone {
  +tocar()
  +pausar()
  +selecionarMusica(String musica)
  +ligar(String numero)
  +atender()
  +iniciarCorreioVoz()
  +exibirPagina(String url)
  +adicionarNovaAba()
  +atualizarPagina()
}

ReprodutorMusical <|.. IPhone
AparelhoTelefonico <|.. IPhone
NavegadorInternet <|.. IPhone
