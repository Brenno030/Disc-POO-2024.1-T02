package br.edu.principal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int op;
        double sal, aum, imp, novoSal;

        System.out.println("----Menu----");
        System.out.println("[1] - Imposto");
        System.out.println("[2] - Novo Salario");
        System.out.println("[3] - Classificação");
        System.out.println("Digite a opção desejada");
        op = in.nextInt();

        if (op == 1) {
            System.out.println("Digite o salário:");
            sal = in.nextDouble();
            if (sal < 500) {
                imp = sal * 5 / 100;
            } else if (sal >= 500 && sal <= 850) {
                imp = sal * 10 / 100;
            } else {
                imp = sal * 15 / 100;
            }
            System.out.println("Valor do imposto é: " + imp + " reais");
        } else if (op == 2) {
            System.out.println("Digite o salário:");
            sal = in.nextDouble();
            if (sal > 1500) {
                novoSal = sal + 25;
            } else if (sal >= 750 && sal <= 1500) {
                novoSal = sal + 50;
            } else if (sal >= 450 && sal < 750) {
                novoSal = sal + 75;
            } else {
                novoSal = sal; // Não houve aumento
            }
            if (novoSal > 2000) {
                novoSal = 2000; // Limite de aumento
            }
            System.out.println("O novo Salario: " + novoSal);
        } else if (op == 3) {
            System.out.println("Digite o salário:");
            sal = in.nextDouble();
            if (sal <= 700) {
                System.out.println("Mal remunerado");
            } else {
                System.out.println("Bem Remunerado");
            }
        } else {
            System.out.println("Opção Inválida!");
        }
    }
}

