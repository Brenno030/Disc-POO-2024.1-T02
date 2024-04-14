package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, soma = 0, qtd = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, qtd_par = 0, soma_par = 0, qtd_impar = 0;

        System.out.println("Digite os números (digite 30000 para encerrar):");
        num = scanner.nextInt();

        while (num != 30000) {
            soma += num;
            qtd++;

            if (num > maior)
                maior = num;
            if (num < menor)
                menor = num;

            if (num % 2 == 0) {
                soma_par += num;
                qtd_par++;
            } else {
                qtd_impar++;
            }

            num = scanner.nextInt();
        }

        if (qtd == 0) {
            System.out.println("Nenhum número digitado.");
        } else {
            double media = (double) soma / qtd;
            System.out.println("Soma dos números: " + soma);
            System.out.println("Quantidade de números digitados: " + qtd);
            System.out.println("Média dos números digitados: " + media);
            System.out.println("Maior número digitado: " + maior);
            System.out.println("Menor número digitado: " + menor);

            if (qtd_par == 0) {
                System.out.println("Nenhum número par digitado.");
            } else {
                double media_par = (double) soma_par / qtd_par;
                System.out.println("Média dos números pares: " + media_par);
            }

            double perc_impar = (double) qtd_impar * 100 / qtd;
            System.out.println("Porcentagem de números ímpares: " + perc_impar + "%");
        }
    }
}
