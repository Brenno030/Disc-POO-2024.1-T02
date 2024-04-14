package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (// Leitura do número N
		Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite o número de valores a serem lidos (N): ");
			int n = scanner.nextInt();

			// Loop para cada valor a ser lido
			for (int i = 1; i <= n; i++) {
			    System.out.print("Digite um valor inteiro e positivo: ");
			    int num = scanner.nextInt();

			    // Cálculo do fatorial
			    int fat = 1;
			    for (int j = 1; j <= num; j++) {
			        fat *= j;
			    }

			    // Exibição da tabela
			    System.out.println("Valor lido: " + num + ", Fatorial: " + fat);
			}
		}
    }
}
