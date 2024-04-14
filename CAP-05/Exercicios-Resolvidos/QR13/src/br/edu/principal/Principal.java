package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de crianças nascidas no período: ");
        int num_cri = scanner.nextInt();
        int tot_m = 0;
        int tot_f = 0;
        int tot_24 = 0;

        if (num_cri == 0) {
            System.out.println("NENHUMA CRIANÇA DIGITADA");
        } else {
            for (int i = 1; i <= num_cri; i++) {
                System.out.print("Digite o sexo da " + i + "ª criança (M/F): ");
                char sexo = scanner.next().charAt(0);
                System.out.print("Digite o tempo de vida (em meses) da " + i + "ª criança: ");
                int meses = scanner.nextInt();

                if (sexo == 'M') {
                    tot_m++;
                } else if (sexo == 'F') {
                    tot_f++;
                }

                if (meses <= 24) {
                    tot_24++;
                }
            }

            double porc_m = (tot_m * 100.0) / num_cri;
            double porc_f = (tot_f * 100.0) / num_cri;
            double porc_24 = (tot_24 * 100.0) / num_cri;

            System.out.println("Percentual de crianças do sexo feminino mortas: " + porc_f + "%");
            System.out.println("Percentual de crianças do sexo masculino mortas: " + porc_m + "%");
            System.out.println("Percentual de crianças com 24 meses ou menos mortas no período: " + porc_24 + "%");
        }
    }
}

