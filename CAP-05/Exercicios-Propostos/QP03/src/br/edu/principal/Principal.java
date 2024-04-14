package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de opções:");
        System.out.println("1. Novo salário");
        System.out.println("2. Férias");
        System.out.println("3. Décimo terceiro");
        System.out.println("4. Sair");
        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o salário atual do funcionário: ");
                double salario = scanner.nextDouble();
                double novoSalario;

                if (salario <= 210) {
                    novoSalario = salario * 1.15;
                } else if (salario <= 600) {
                    novoSalario = salario * 1.10;
                } else {
                    novoSalario = salario * 1.05;
                }

                System.out.println("Novo salário: R$ " + novoSalario);
                break;
            case 2:
                System.out.print("Digite o salário atual do funcionário: ");
                double salarioFerias = scanner.nextDouble();
                double valorFerias = salarioFerias + (salarioFerias / 3);
                System.out.println("Valor das férias: R$ " + valorFerias);
                break;
            case 3:
                System.out.print("Digite o salário atual do funcionário: ");
                double salarioDecimo = scanner.nextDouble();
                System.out.print("Digite o número de meses de trabalho na empresa (máximo 12): ");
                int mesesTrabalhados = scanner.nextInt();
                double valorDecimo = salarioDecimo * mesesTrabalhados / 12;
                System.out.println("Valor do décimo terceiro: R$ " + valorDecimo);
                break;
            case 4:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
