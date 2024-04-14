package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um valor inteiro positivo (0 para encerrar): ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                System.out.println("Valor negativo. Por favor, digite um valor positivo.");
            } else if (valor == 0) {
                break;
            } else {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        }

        System.out.println("Maior valor: " + (maior != Integer.MIN_VALUE ? maior : "Nenhum valor válido inserido"));
        System.out.println("Menor valor: " + (menor != Integer.MAX_VALUE ? menor : "Nenhum valor válido inserido"));
    }
}
