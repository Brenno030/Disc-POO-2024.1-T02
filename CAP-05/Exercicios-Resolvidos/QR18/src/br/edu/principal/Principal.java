package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num, quad, cubo, raiz;

        System.out.println("Digite um conjunto não determinado de valores (digite 0 ou negativo para encerrar):");

        do {
            System.out.print("Digite um número: ");
            num = scanner.nextDouble();

            if (num <= 0) {
                break;
            }

            quad = num * num;
            cubo = num * num * num;
            raiz = Math.sqrt(num);

            System.out.println("Número: " + num);
            System.out.println("Quadrado: " + quad);
            System.out.println("Cubo: " + cubo);
            System.out.println("Raiz Quadrada: " + raiz);
        } while (num > 0);
    }
}
