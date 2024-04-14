package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] vetor1 = new int[10];
        System.out.println("Digite 10 números inteiros para preencher o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = sc.nextInt();
        }

        
        int[] vetor2 = new int[5];
        System.out.println("Digite 5 números inteiros para preencher o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = sc.nextInt();
        }

        
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + vetor1[i]);
            boolean achou = false;
            for (int j = 0; j < 5; j++) {
                if (vetor1[i] % vetor2[j] == 0) {
                    System.out.println("Divisível por " + vetor2[j] + " na posição " + (j + 1));
                    achou = true;
                }
            }
            if (!achou) {
                System.out.println("Não possui divisores no segundo vetor");
            }
        }
    }
}

