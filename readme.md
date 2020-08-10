# Project TOTSV

Projeto Criado para desafio de automatizar o caso de teste enviado pro email. 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Pre-requisites

- Instalado na maquina a IntelliJ IDEA (Versão mais atual)
- Instalado na maquina java version "1.8.0_211"
- Navegador Google Chrome Versão 83.0.4103.116 (Versão oficial) 64 bits 

## Running the tests

- Realizar o Download do projeto.
- Descompactar a pasta do projeto.
- No IntelliJ IDEA acessar "File/Open" selecionar a pasta do projeto descompactado.
- Com o projeto carregado no IntelliJ IDEA é necessario realizar o download das dependencias.
Para realização do Dowload das dependencias o propio IntelliJ IDEA exibe um Pop-up para dowload
ou clicando na barra do lado esquerdo na opção Maven e clicar em Reload all Mavem Project.

### Project Information

O projeto contem 2 testes.

- Teste de uma API do mocky.io. 
    - Basta executar a Class TesteApi (src/test/java/testePAI/TesteApi) para validar se o GET retorna a palavra World e o HTTP status code é igual a 200.
    
- Teste OLX.
    - Utilizei selenium com cucumber para montar os cenarios de testes. Iremos realizar os seguintes cenarios.
       
        1 - Realizar login com ERRO
        
        2 - Realizar login com SUCESSO
        
        3 - Realizar a busca de um item e favoritar
        
        4 - desfavoritar o item
        
    - Para execução dos cenarior basta executar a class "ExecucaoTesteOlx" (srctest/java/ExecucaoTesteOlx).
    
    - em cada teste validamos se houve sucesso no resultado esperado e no cenario numero 3 tiramos um print do item que foi feito a busca como evidencia (src/target/Screenshot_Evidencias)
         
   



## Authors

* **Raphael Lima de Souza** - [GitHub Raphael](https://github.com/Raphaelenzo)


