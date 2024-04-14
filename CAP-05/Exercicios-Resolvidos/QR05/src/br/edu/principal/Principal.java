package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_termos, expoente, denominador = 1;
        double x, s = 0.0, fat;

        System.out.print("Digite o número de termos: ");
        num_termos = scanner.nextInt();
        System.out.print("Digite um valor positivo para X: ");
        x = scanner.nextDouble();

        for (int i = 1; i <= num_termos; i++) {
            int fim = denominador;
            fat = 1;

            for (int j = 1; j <= fim; j++) {
                fat *= j;
            }

            expoente = i + 1;

            if (expoente % 2 == 0) {
                s -= Math.pow(x, expoente) / fat;
            } else {
                s += Math.pow(x, expoente) / fat;
            }

            if (denominador == 4) {
                denominador = -1;
            }

            if (denominador == 1) {
                denominador = 1;
            }

            if (denominador == 1) {
                denominador++;
            } else {
                denominador--;
            }
        }

        System.out.println("O valor da série é: " + s);
    }
}
