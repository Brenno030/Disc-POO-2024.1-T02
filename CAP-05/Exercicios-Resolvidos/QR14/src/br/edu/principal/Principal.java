package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial da dívida: ");
        double valor_inicial = sc.nextDouble();

        double juros = 0;
        int num_parc = 1;
        double total = valor_inicial;
        double valor_parc = valor_inicial;

        System.out.println("Valor da dívida\tValor dos juros\tQuantidade de parcelas\tValor da parcela");

        for (int i = 0; i < 4; i++) {
            double valor_juros = valor_inicial * juros / 100;
            total = valor_inicial + valor_juros;
            valor_parc = total / num_parc;

            System.out.printf("R$ %.2f\t%.2f\t%d\tR$ %.2f\n", total, valor_juros, num_parc, valor_parc);

            juros += 5;
            num_parc += 3;
        }
    }
}