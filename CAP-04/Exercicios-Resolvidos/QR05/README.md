# Quetão 05
Este código em Java implementa um programa que solicita ao usuário três números e os ordena em ordem crescente. Ele realiza essa tarefa por meio de comparações condicionais entre os números fornecidos, garantindo que os números sejam impressos na ordem correta.

Passo a passo do que o programa faz:

1. Importa a classe Scanner para possibilitar a entrada de dados pelo usuário.
2. Declara três variáveis inteiras, `num1`, `num2` e `num3`, para armazenar os números fornecidos.
3. Solicita que o usuário insira o primeiro número e armazena-o na variável `num1`.
4. Solicita que o usuário insira o segundo número e armazena-o na variável `num2`.
5. Solicita que o usuário insira o terceiro número e armazena-o na variável `num3`.
6. O programa começa a comparar os números para determinar a ordem crescente:
   - Verifica se `num1` é o menor entre os três números. Se sim, verifica se `num2` é menor que `num3` e, em seguida, imprime os números na ordem `num1`, `num2`, `num3`.
   - Se `num1` não for o menor, mas `num2` for, verifica se `num1` é menor que `num3` e, em seguida, imprime os números na ordem `num2`, `num1`, `num3`.
   - Se `num1` e `num2` não forem os menores, significa que `num3` é o menor entre os três. Portanto, imprime os números na ordem `num3`, `num1`, `num2`.
7. Finaliza a execução do programa após imprimir os números em ordem crescente.

Em resumo, este código executa a ordenação crescente dos três números inseridos pelo usuário, garantindo que sejam impressos na sequência correta.
