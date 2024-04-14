package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, tot_f = 0, tot_m = 0, soma_idade_m = 0, cont_m_com_exp = 0, cont_f_jovem_com_exp = 0;
        int menor_idade_f_com_exp = Integer.MAX_VALUE, cont_mais_45_m = 0, total_candidatos = 0;
        char sexo, exp;

        System.out.println("Digite a idade, sexo (M ou F) e experiência (S ou N) dos candidatos (digite 0 para encerrar):");

        do {
            idade = scanner.nextInt();
            if (idade == 0)
                break;

            sexo = scanner.next().charAt(0);
            exp = scanner.next().charAt(0);
            total_candidatos++;

            if (sexo == 'F') {
                tot_f++;
                if (idade < 21 && exp == 'S') {
                    cont_f_jovem_com_exp++;
                }
                if (exp == 'S' && idade < menor_idade_f_com_exp) {
                    menor_idade_f_com_exp = idade;
                }
            } else if (sexo == 'M') {
                tot_m++;
                if (idade > 45) {
                    cont_mais_45_m++;
                }
                if (exp == 'S') {
                    soma_idade_m += idade;
                    cont_m_com_exp++;
                }
            }

        } while (idade != 0);

        System.out.println("Número de candidatos do sexo feminino: " + tot_f);
        System.out.println("Número de candidatos do sexo masculino: " + tot_m);

        if (cont_m_com_exp == 0) {
            System.out.println("Nenhum homem com experiência.");
        } else {
            double media_idade_m_com_exp = (double) soma_idade_m / cont_m_com_exp;
            System.out.println("Idade média dos homens com experiência: " + media_idade_m_com_exp);
        }

        if (tot_m == 0) {
            System.out.println("Nenhum homem.");
        } else {
            double perc_mais_45_m = (double) cont_mais_45_m * 100 / tot_m;
            System.out.println("Porcentagem de homens com mais de 45 anos: " + perc_mais_45_m + "%");
        }

        System.out.println("Número de mulheres com idade inferior a 21 anos e com experiência: " + cont_f_jovem_com_exp);
        if (menor_idade_f_com_exp == Integer.MAX_VALUE) {
            System.out.println("Nenhuma mulher com experiência.");
        } else {
            System.out.println("Menor idade entre as mulheres com experiência: " + menor_idade_f_com_exp);
        }
    }
}
