# EntregaSpring - Aplicação Spring Boot para Cálculos Estatísticos
A aplicação EntregaSpring é um projeto Spring Boot que oferece endpoints para calcular estatísticas básicas a partir de um conjunto de valores numéricos. Ela permite adicionar uma lista de valores e, em seguida, calcular a média, o desvio padrão, a mediana e a quantidade de números inseridos nessa lista. Este README fornece uma visão geral do código e dos endpoints disponíveis.

### Funcionalidades
Adicionar Valores: O endpoint POST /dados/AdicionarValor permite adicionar uma lista de valores numéricos.
Calcular Estatísticas: O endpoint GET /dados/CalcularValor calcula e retorna a média, o desvio padrão, a mediana e a quantidade de números inseridos.
Como Executar
Certifique-se de ter o Java JDK e o Spring Boot instalados. Você pode executar a aplicação usando o seguinte comando:

### bash
Copy code
./mvnw spring-boot:run
## Endpoints
### Adicionar Valores
URL: /dados/AdicionarValor

Método: POST

Corpo da Requisição: Lista de valores numéricos (List<Double>) 

Resposta de Sucesso: "Valor adicionado com sucesso!"


Exemplo de Requisição:
json

POST /dados/AdicionarValor

[10.5, 20.3, 15.2, 25.7]

### Calcular Estatísticas
URL: /dados/CalcularValor

Método: GET

Resposta de Sucesso: 
Estatísticas calculadas, incluindo valores, média, desvio padrão, mediana e quantidade.

Exemplo de Resposta:

Valores: [10.5, 20.3, 15.2, 25.7]

Média: 17.925

Desvio Padrão: 5.768

Mediana: 17.75

Quantidade de números inseridos: 4

### Lógica de Cálculo
A aplicação realiza os seguintes cálculos para os valores inseridos:

Média: Calcula a média dos valores inseridos.
Desvio Padrão: Calcula o desvio padrão amostral dos valores inseridos.
Mediana: Calcula a mediana dos valores inseridos.
Quantidade: Retorna a quantidade de valores inseridos.

## Este é um projeto simples com o objetivo de demonstrar o uso básico do Spring Boot para cálculos estatísticos. Sinta-se à vontade para clonar, modificar e contribuir para o projeto.

### Aviso
Este projeto é fornecido como está, sem garantias expressas ou implícitas. Use por sua própria conta e risco.

# Autor: Lucas Adriano Ferreira Gimenez

