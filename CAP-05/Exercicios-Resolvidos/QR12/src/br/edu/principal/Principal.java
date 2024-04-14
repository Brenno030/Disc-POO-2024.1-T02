package br.edu.principal;

import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_op, pecas_op, num_maior = 0, cont_m = 0, cont_f = 0;
        double tot_pecas = 0, cont = 0, media_m = 0, salario_maior = 0, media_f = 0, salario_op, tot_folha = 0;
        char sexo_op;

        for (int contagem = 1; contagem <= 15; contagem++) {
            System.out.println("Digite o número do " + contagem + "º operário:");
            num_op = scanner.nextInt();
            System.out.println("Digite o sexo do operário (M ou F):");
            sexo_op = scanner.next().charAt(0);
            System.out.println("Digite o total de peças fabricadas pelo " + contagem + "º operário:");
            pecas_op = scanner.nextInt();

            if (pecas_op <= 30)
                salario_op = 450;
            else if (pecas_op <= 50)
                salario_op = 450 + ((pecas_op - 30) * 3 / 100 * 450);
            else
                salario_op = 450 + ((pecas_op - 30) * 5 / 100 * 450);

            System.out.println("O operário de número " + num_op + " recebe salário = " + salario_op);
            tot_folha += salario_op;
            tot_pecas += pecas_op;

            if (sexo_op == 'M') {
                media_m += pecas_op;
                cont_m++;
            } else {
                media_f += pecas_op;
                cont_f++;
            }

            if (cont == 1) {
                salario_maior = salario_op;
                num_maior = num_op;
            } else {
                if (salario_op > salario_maior) {
                    salario_maior = salario_op;
                    num_maior = num_op;
                }
            }

            cont++;
        }

        if (cont_m != 0)
            media_m /= cont_m;
        if (cont_f != 0)
            media_f /= cont_f;

        System.out.println("Total da folha de pagamento da fábrica: " + tot_folha);
        System.out.println("Número total de peças fabricadas no mês: " + tot_pecas);
        System.out.println("Média de peças fabricadas pelos homens: " + media_m);
        System.out.println("Média de peças fabricadas pelas mulheres: " + media_f);
        System.out.println("Número do operário ou operária de maior salário: " + num_maior);

        
    }
}
