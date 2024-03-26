# Questão 04
Este código em Java solicita ao usuário três números e, em seguida, os ordena em ordem crescente. Ele faz isso por meio de uma série de comparações condicionais para determinar qual dos números é o menor e, em seguida, imprime os números na ordem crescente.

Aqui está uma descrição passo a passo do que o programa faz:

1. O programa importa a classe Scanner para permitir entrada de dados do usuário.
2. Ele declara três variáveis inteiras, `num1`, `num2` e `num3`, para armazenar os números fornecidos pelo usuário.
3. O programa solicita que o usuário insira o primeiro número e armazena-o na variável `num1`.
4. Em seguida, solicita ao usuário que insira o segundo número e armazena-o na variável `num2`.
5. Por fim, solicita ao usuário que insira o terceiro número e armazena-o na variável `num3`.
6. O programa então começa a comparar os números para determinar a ordem crescente:
   - Verifica se `num1` é menor que `num2` e `num3`. Se sim, verifica se `num2` é menor que `num3` e imprime os números na ordem `num1`, `num2`, `num3`.
   - Se `num1` não for o menor, mas `num2` for, verifica se `num1` é menor que `num3` e imprime os números na ordem `num2`, `num1`, `num3`.
   - Se `num1` e `num2` não forem os menores, imprime os números na ordem `num3`, `num1`, `num2`.

Essencialmente, este código determina a ordem crescente dos três números fornecidos pelo usuário.
