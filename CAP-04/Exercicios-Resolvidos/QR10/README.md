# Questão 10
Este código Java solicita ao usuário que insira duas datas (dia, mês e ano) e determina qual das duas datas é a maior. Ele realiza isso comparando os anos primeiro e, em seguida, os meses, e por fim, os dias, se os anos e os meses forem iguais.

Aqui está uma descrição passo a passo do que o programa faz:

1. Importa a classe Scanner para permitir entrada de dados pelo usuário.
2. Declara variáveis para armazenar os componentes da primeira data (`d1`, `m1`, `a1`) e da segunda data (`d2`, `m2`, `a2`).
3. Solicita ao usuário que insira os componentes da primeira data: dia, mês e ano.
4. Lê os componentes da primeira data fornecidos pelo usuário e armazena-os nas variáveis correspondentes.
5. Solicita ao usuário que insira os componentes da segunda data: dia, mês e ano.
6. Lê os componentes da segunda data fornecidos pelo usuário e armazena-os nas variáveis correspondentes.
7. Compara os anos das duas datas:
   - Se o ano da primeira data for maior que o ano da segunda data, imprime que a maior data é a primeira.
   - Se o ano da segunda data for maior que o ano da primeira data, imprime que a maior data é a segunda.
   - Se os anos forem iguais, compara os meses.
8. Se os meses das duas datas forem comparados:
   - Se o mês da primeira data for maior que o mês da segunda data e os anos forem iguais, imprime que a maior data é a primeira.
   - Se o mês da segunda data for maior que o mês da primeira data e os anos forem iguais, imprime que a maior data é a segunda.
   - Se os meses forem iguais, compara os dias.
9. Se os dias das duas datas forem comparados:
   - Se o dia da primeira data for maior que o dia da segunda data e os anos e meses forem iguais, imprime que a maior data é a primeira.
   - Se o dia da segunda data for maior que o dia da primeira data e os anos e meses forem iguais, imprime que a maior data é a segunda.
10. Se os anos, meses e dias forem iguais, imprime que as datas são iguais.

Em resumo, este código determina qual das duas datas fornecidas pelo usuário é a maior ou se são iguais, considerando os anos, meses e dias.
