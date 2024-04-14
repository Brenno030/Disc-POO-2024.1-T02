package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		        try (// Leitura do valor N
				Scanner scanner = new Scanner(System.in)) {
					System.out.print("Digite um valor inteiro e positivo para N: ");
					int n = scanner.nextInt();

					// Chamada do método para calcular E e impressão do resultado
					double resultado = calcularE(n);
					System.out.println("O valor de E é: " + resultado);
				}
		    }

		    public static double calcularE(int n) {
		        double e = 1.0;

		        for (int i = 1; i <= n; i++) {
		            int fat = 1;
		            for (int j = 1; j <= i; j++) {
		                fat *= j;
		            }
		            e += 1.0 / fat;
		        }

		        return e;
		    }

	}
