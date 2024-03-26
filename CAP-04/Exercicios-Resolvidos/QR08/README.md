# Questão 08
Este código em Java apresenta um menu de opções para o usuário e executa a ação correspondente à opção selecionada. As opções disponíveis são:

1. Somar dois números.
2. Calcular a raiz quadrada de um número.
3. Tratar opções inválidas.

Aqui está uma descrição passo a passo do que o programa faz:

1. Importa a classe Scanner para permitir entrada de dados pelo usuário.
2. Declara variáveis para armazenar dois números (`num1` e `num2`), o resultado da soma (`soma`), a opção selecionada pelo usuário (`op`) e o resultado da raiz quadrada (`raiz`).
3. Exibe um menu com as opções disponíveis para o usuário.
4. Solicita ao usuário que insira a opção desejada.
5. Lê a opção fornecida pelo usuário.
6. Se a opção selecionada for 1:
   - Solicita ao usuário que insira dois números.
   - Lê os dois números fornecidos.
   - Calcula a soma dos dois números.
   - Imprime o resultado da soma.
7. Se a opção selecionada for 2:
   - Solicita ao usuário que insira um número.
   - Lê o número fornecido.
   - Calcula a raiz quadrada do número utilizando a função `Math.sqrt()`.
   - Imprime o resultado da raiz quadrada.
8. Se a opção selecionada não for 1 nem 2, imprime "Opção inválida!".
9. O programa finaliza após executar a ação correspondente à opção selecionada pelo usuário.

Em resumo, este código oferece ao usuário um menu simples com duas opções e executa a ação escolhida pelo usuário ou exibe uma mensagem de "Opção inválida!" se uma opção inválida for selecionada.
