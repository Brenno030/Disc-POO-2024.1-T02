package br.edu.principal;

import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m, n, soma;

        do {
            System.out.print("Digite o valor de m: ");
            m = scanner.nextInt();
            System.out.print("Digite o valor de n: ");
            n = scanner.nextInt();

            if (m >= n) {
                break;
            }

            soma = 0;
            for (int i = m; i <= n; i++) {
                soma += i;
            }

            System.out.println("Soma dos números entre " + m + " e " + n + ": " + soma);
        } while (m < n); 
    }
}