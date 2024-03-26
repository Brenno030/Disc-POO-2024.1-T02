#  Questão 11
Este código Java solicita ao usuário que insira os horários inicial e final de um jogo (horas e minutos) e calcula a duração do jogo em horas e minutos.

Aqui está uma descrição passo a passo do que o programa faz:

1. Importa a classe Scanner para permitir entrada de dados pelo usuário.
2. Declara variáveis para armazenar os componentes do horário inicial (`hora_i` e `min_i`) e do horário final (`hora_f` e `min_f`), bem como as variáveis para armazenar a duração em horas (`hora_d`) e minutos (`min_d`).
3. Solicita ao usuário que insira o horário inicial do jogo (hora e minuto) e lê os valores fornecidos.
4. Solicita ao usuário que insira o horário final do jogo (hora e minuto) e lê os valores fornecidos.
5. Verifica se os minutos iniciais (`min_i`) são maiores que os minutos finais (`min_f`). Se sim, adiciona 60 minutos aos minutos finais e subtrai 1 hora do horário final (`hora_f`), pois ultrapassou uma hora.
6. Verifica se a hora inicial (`hora_i`) é maior que a hora final (`hora_f`). Se sim, adiciona 24 horas ao horário final para corrigir o cálculo.
7. Calcula a duração do jogo em minutos, subtraindo os minutos iniciais dos minutos finais, e em horas, subtraindo as horas iniciais das horas finais.
8. Imprime a duração do jogo em horas e minutos.

Em resumo, este código calcula a duração de um jogo com base nos horários inicial e final fornecidos pelo usuário, considerando possíveis ultrapassagens de horas e minutos.
