# Questão 09
Este código Java mostra a data e hora atuais usando a classe `LocalDateTime` da biblioteca `java.time`. Ele obtém a data e hora atuais por meio do método `now()` e, em seguida, extrai os componentes individuais, como dia, mês, ano, hora e minuto.

Aqui está uma descrição passo a passo do que o programa faz:

1. Importa as classes necessárias: `LocalDateTime`, `DateTimeFormatter` e `Locale`.
2. No método `main()`, instancia um objeto `LocalDateTime` chamado `now` que representa a data e hora atuais.
3. Obtém os componentes da data e hora atual usando métodos como `getDayOfMonth()`, `getMonthValue()`, `getYear()`, `getHour()` e `getMinute()`.
4. Utiliza um switch-case para determinar o nome do mês correspondente ao valor numérico do mês.
5. Imprime a data atual formatada como "dia/mês/ano - nome_do_mês" e a hora atual no formato "hora:minuto".

Em resumo, este código mostra a data e hora atuais em um formato legível para o usuário, incluindo o nome do mês por extenso.
