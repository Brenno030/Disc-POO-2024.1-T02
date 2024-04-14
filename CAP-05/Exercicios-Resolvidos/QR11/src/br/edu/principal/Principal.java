package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que 1: ");
        int num = scanner.nextInt();

        while (num <= 1) {
            System.out.print("Por favor, digite um número inteiro maior que 1: ");
            num = scanner.nextInt();
        }

        String resultado = verificaPrimo(num);
        System.out.println(resultado);

        scanner.close();
    }

    public static String verificaPrimo(int num) {
        int qtde = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                qtde++;
            }
        }
        if (qtde > 2) {
            return "Número não primo";
        } else {
            return "Número primo";
        }
    }
}

