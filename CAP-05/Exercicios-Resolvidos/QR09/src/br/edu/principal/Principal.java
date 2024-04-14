package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, ta = 0, te = 0, tr = 0;
        double media, total_classe = 0, media_classe;

        for (int cont = 1; cont <= 6; cont++) {
            System.out.println("Digite as duas notas do aluno " + cont + ":");
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();

            media = (n1 + n2) / 2;
            System.out.println("Média aritmética: " + media);

            if (media <= 3) {
                tr++;
                System.out.println("Reprovado");
            } else if (media < 7) {
                te++;
                System.out.println("Exame");
            } else {
                ta++;
                System.out.println("Aprovado");
            }

            total_classe += media;
        }

        System.out.println("Total de alunos reprovados: " + tr);
        System.out.println("Total de alunos de exame: " + te);
        System.out.println("Total de alunos aprovados: " + ta);

        media_classe = total_classe / 6;
        System.out.println("Média da classe: " + media_classe);
    }
}
