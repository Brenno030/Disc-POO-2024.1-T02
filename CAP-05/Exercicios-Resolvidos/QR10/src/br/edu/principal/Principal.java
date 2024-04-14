package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade, qtde = 0, tot80 = 0;
        double peso, alt, media_idade, media_altura = 0, porc;

        for (int cont_time = 1; cont_time <= 5; cont_time++) {
            media_idade = 0;

            for (int cont_jog = 1; cont_jog <= 11; cont_jog++) {
                System.out.println("Time " + cont_time + ", Jogador " + cont_jog + ":");
                idade = scanner.nextInt();
                peso = scanner.nextDouble();
                alt = scanner.nextDouble();

                if (idade < 18) {
                    qtde++;
                }

                media_idade += idade;
                media_altura += alt;

                if (peso > 80) {
                    tot80++;
                }
            }

            media_idade /= 11;
            System.out.println("Média de idade do Time " + cont_time + ": " + media_idade);
        }

        System.out.println("Quantidade de jogadores com menos de 18 anos: " + qtde);
        media_altura /= 55;
        System.out.println("Média de altura de todos os jogadores do campeonato: " + media_altura);

        porc = (double) tot80 * 100 / 55;
        System.out.println("Porcentagem de jogadores com mais de 80 kg: " + porc + "%");
    }
}
