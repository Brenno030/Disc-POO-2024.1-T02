package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pessoasSim = 0;
        int pessoasNao = 0;
        int mulheresSim = 0;
        int homensTotal = 0;
        int homensNao = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            System.out.print("Resposta (S/N): ");
            char resposta = scanner.next().charAt(0);

            if (resposta == 'S') {
                pessoasSim++;
                if (sexo == 'F') {
                    mulheresSim++;
                }
            } else {
                pessoasNao++;
                if (sexo == 'M') {
                    homensTotal++;
                    homensNao++;
                }
            }
        }

        double porcentagemHomensNao = (homensNao * 100.0) / homensTotal;

        System.out.println("Número de pessoas que responderam sim: " + pessoasSim);
        System.out.println("Número de pessoas que responderam não: " + pessoasNao);
        System.out.println("Número de mulheres que responderam sim: " + mulheresSim);
        System.out.println("Percentagem de homens que responderam não: " + porcentagemHomensNao + "%");
    }
}
