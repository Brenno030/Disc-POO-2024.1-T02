package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sal, qtd, tipo, valor_kw, gasto, acresc, total, tot_geral = 0;
        int qtd_cons = 0;

        System.out.println("Digite o valor do salário mínimo:");
        sal = scanner.nextDouble();
        System.out.println("Digite a quantidade de quilowatts gasta por consumidor (digite 0 para encerrar):");
        qtd = scanner.nextDouble();

        valor_kw = sal / 8;

        while (qtd != 0) {
            gasto = qtd * valor_kw;

            System.out.println("Digite o tipo de consumidor (1 — residencial; 2 — comercial; ou 3 — industrial):");
            tipo = scanner.nextDouble();

            if (tipo == 1) {
                acresc = gasto * 5 / 100;
            } else if (tipo == 2) {
                acresc = gasto * 10 / 100;
            } else if (tipo == 3) {
                acresc = gasto * 15 / 100;
            } else {
                acresc = 0; 
            }

            total = gasto + acresc;
            tot_geral += total;

            if (total >= 500 && total <= 1000) {
                qtd_cons++;
            }

            System.out.println("Valor do consumo: " + gasto);
            System.out.println("Valor do acréscimo: " + acresc);
            System.out.println("Valor total a ser pago: " + total);

            System.out.println("Digite a quantidade de quilowatts gasta por consumidor (digite 0 para encerrar):");
            qtd = scanner.nextDouble();
        }

        System.out.println("Faturamento geral da empresa: " + tot_geral);
        System.out.println("Quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00: " + qtd_cons);

    }
}
