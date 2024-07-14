CONVERSOR DE MOEDAS

Este é um conversor de moedas simples desenvolvido em Java. O projeto utiliza a API da ExchangeRate-API para obter taxas de câmbio em tempo real e permite que o usuário converta valores entre diferentes moedas através do console.

Funcionalidades
Conversão de moedas em tempo real.
Suporte a várias moedas: USD, EUR, GBP, JPY, AUD, CAD, CHF, BRL.
Interface de usuário através do console.
Requisitos
Java Development Kit (JDK) 8 ou superior.
IntelliJ IDEA ou qualquer outro IDE Java.
Conexão com a Internet para acessar a API de taxas de câmbio.

Configuração do Projeto
Este projeto utiliza a biblioteca Gson para processamento de JSON. Se você estiver usando Maven, adicione a seguinte dependência ao seu pom.xml:

<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
</dependency>

Se não estiver usando Maven, baixe o JAR do Gson  e adicione-o manualmente ao seu projeto no IntelliJ.

Clave da API
Obtenha uma chave de API gratuita da ExchangeRate-API. Substitua pela sua próprio API key na classe CurrencyAPI.

Estrutura do Projeto
O projeto está organizado em cinco classes principais:

CurrencyConverterApp: Contém o método main e permite a entrada de dados pelo console.
Currency: Representa uma moeda.
CurrencyAPI: Responsável por buscar as taxas de câmbio da API externa.
CurrencyConverterService: Realiza a conversão de moedas.
CurrencyConversionException: Exceções específicas para o conversor de moedas.

Uso
1 - Clone este repositório ou baixe o código fonte.
2 - Abra o projeto no IntelliJ IDEA ou em qualquer outro IDE Java.
3 - Certifique-se de adicionar a biblioteca Gson ao seu projeto.
4 - Substitua "YOUR_API_KEY" pela sua própria chave de API na classe CurrencyAPI.
5 - Execute a classe CurrencyConverterApp.
6 - Siga as instruções no console para realizar a conversão de moedas.

Contribuição
Se você quiser contribuir para este projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request.

