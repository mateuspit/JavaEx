## ☑️ Exercícios

- **O que é esse número?(Exercicio1)**
    
    Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    
    ```java
    // Exemplos de Saída
    -5 é ímpar e negativo.
    10 é par e positivo.
    ```
    
- **Fibonacci(Exercicio2)**
    
    Dado um número inteiro `x`, imprima uma sequência de Fibonacci de tamanho `x`.
    
    ```java
    // Exemplo de saída para uma sequência de tamanho 5
    0 1 1 2 3
    
    // Exemplo de saída para uma sequência de tamanho 10
    0 1 1 2 3 5 8 13 21 34
    
    // Exemplo de saída para uma sequência de tamanho 20
    0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
    ```
    
- **MultiplicaAí(Exercicio3)**
    
    Escreva um código que deve imprimir a tabela de multiplicação de algum número fornecido além de exibir um cabeçalho com o nome `Tabela de multiplicação de X`, onde X é o número a ser multiplicado.
    
    ```java
    // Exemplo de saída
    Tabela de multiplicação por 5
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
    ```
    
- **Pirâmide de números(Exercicio4)**
    
    Crie uma pirâmide de números, onde você deve imprimir em cada linha separada a quantidade de números que está sendo iterado no momento. 
    
    Por exemplo, se a sua iteração for de 5 elementos, o resultado final ficaria assim:
    
    ```java
    1
    22
    333
    4444
    55555
    ```
    
- **Duplicados não!(Exercicio5)**
    
    Escreva um código que encontre os elementos em comum que existem em dois arrays e imprima no console quais são esses elementos, um a um.
    
    ```java
    // Exemplo com as seguintes entradas:
    
    array1 => "Morango", "Banana", "Maçã", "Uva", "Caqui"
    array2 => "Manga", "Caqui", "Morango", "Amora"
    
    // A saída seria:
    Morango
    Caqui
    ```
    
- **Holidayzer(Exercicio6)**
    
    Vamos criar uma aplicação Java que será um calendário de feriados! Para isso, queremos:
    
    - Uma função que imprime a lista com todos os feriados
    - Uma função que recebe uma data como parâmerto e retorna uma mensagem.
        - Se o dia não for feriado, imprime: “Dia <data-inserida> não é feriado 🥲”
        - Se o dia for feriado, retorna: “Dia <data-inserida> é <nome-do-feriado>! 🎉”
    - Os feriados devem ser objetos criados a partir de uma classe. Lembre-se de utilizar o conceito de encapsulamento (com `getters` e `setters` conforme a necessidade).
    - Utilize mais parâmetros e funções caso sinta necessidade.
    
    - 📅 Lista de Feriados
        
        ```java
        "01-01-2024" => "Confraternização Mundial"
        "12-02-2024" => "Carnaval"
        "13-02-2024" => "Carnaval"
        "29-03-2024" => "Sexta-feira Santa"
        "21-04-2024" => "Tiradentes"
        "01-05-2024" => "Dia do Trabalho"
        "30-05-2024" => "Corpus Christi"
        "07-09-2024" => "Independência do Brasil"
        "12-10-2024" => "Nossa Senhora Aparecida"
        "02-11-2024" => "Finados"
        "15-11-2024" => "Proclamação da República"
        "20-11-2024" => "Dia Nacional de Zumbi e da Consciência Negra"
        "25-12-2024" => "Natal"
        ```
- **APItização dos Feriados (APIEx)**
    
    Transforme o exercício anterior em uma API! As rotas à seguir são correspondentes às funções descritas:
    
    - **GET** `/holidays`
    - **GET** `/holidays/:date` (data no formato `30-05-2024`)
