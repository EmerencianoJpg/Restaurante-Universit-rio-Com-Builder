# Restaurante Universitário em Java com Padrão Builder
![Java Logo](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

Este projeto é uma aplicação simples desenvolvida em Java para gerenciar o cardápio de um restaurante universitário. A nova versão do projeto foi refatorada para incorporar o padrão de projeto **Builder**.

## Padrão de Projeto (Builder)

O padrão Builder é um padrão de criação que separa a construção de um objeto complexo de sua representação. Ele fornece uma interface clara para construir um objeto passo a passo. O padrão é especialmente útil quando uma classe tem muitos atributos, pois permite definir apenas os atributos necessários, tornando o código mais legível e compreensível. Ele também ajuda a evitar a criação de construtores com muitas combinações de parâmetros.

## Funcionalidades

  * **Gerenciar Cardápio:** A aplicação permite adicionar, deletar e visualizar os itens do cardápio.
  * **Construção de Objetos:** A classe `CardapioDadosBuilder` é usada para criar objetos do cardápio de forma flexível e explícita.
  * **Interface Gráfica:** A aplicação possui uma interface gráfica (GUI) intuitiva para a interação com o usuário, construída com componentes Swing.

## Tecnologias Utilizadas

O projeto foi desenvolvido em **Java** e utiliza a biblioteca padrão **Swing** para a criação da interface gráfica.

## Como Instalar e Rodar

1.  **Baixe os arquivos:** Faça o download de todos os arquivos do repositório.
2.  **Abra em um compilador Java:** Exporte o projeto para uma IDE de sua preferência (como IntelliJ IDEA, Eclipse ou NetBeans).
3.  **Execute o projeto:** Rode a aplicação a partir da classe `Main.java`.
