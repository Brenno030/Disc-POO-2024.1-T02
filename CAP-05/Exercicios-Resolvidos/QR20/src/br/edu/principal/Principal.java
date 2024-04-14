package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cod, num_h, cont_m = 0, cont_f = 0;
        double sal_b, sal_l = 0, media_m = 0, media_f = 0;
        String sexo;

        System.out.println("Informe o código do professor (99999 para sair): ");
        cod = scanner.nextInt();

        while (cod != 99999) {
            System.out.println("Informe o sexo do professor (M/F): ");
            sexo = scanner.next();
            System.out.println("Informe o número de horas/aula: ");
            num_h = scanner.nextInt();

            sal_b = num_h * 30.0; // Cada hora/aula vale R$ 30,00

            if (sexo.equals("M")) {
                sal_l = sal_b - (sal_b * 0.10); // Desconto de 10% para homens
                media_m += sal_l;
                cont_m++;
            } else if (sexo.equals("F")) {
                sal_l = sal_b - (sal_b * 0.05); // Desconto de 5% para mulheres
                media_f += sal_l;
                cont_f++;
            }

            System.out.println("Código: " + cod);
            System.out.println("Salário bruto: R$ " + sal_b);
            System.out.println("Salário líquido: R$ " + sal_l);

            System.out.println("Informe o código do próximo professor (99999 para sair): ");
            cod = scanner.nextInt();
        }

        if (cont_m == 0) {
            System.out.println("Nenhum professor do sexo masculino.");
        } else {
            media_m /= cont_m;
            System.out.println("Média dos salários líquidos dos professores do sexo masculino: R$ " + media_m);
        }

        if (cont_f == 0) {
            System.out.println("Nenhum professor do sexo feminino.");
        } else {
            media_f /= cont_f;
            System.out.println("Média dos salários líquidos dos professores do sexo feminino: R$ " + media_f);
        }
    }
}
