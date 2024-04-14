package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        
        do {
            System.out.println("MENU DE OPÇÕES");
            System.out.println("1- Imposto");
            System.out.println("2- Novo Salário");
            System.out.println("3- Classificação");
            System.out.println("4- Finalizar o programa");
            System.out.println("Digite a opção desejada:");
            op = scanner.nextInt();
            
            switch(op) {
                case 1:
                    calcularImposto();
                    break;
                case 2:
                    calcularNovoSalario();
                    break;
                case 3:
                    classificarSalario();
                    break;
                case 4:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while(op != 4);
        
        scanner.close();
    }
    
    public static void calcularImposto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        double sal = scanner.nextDouble();
        double imp;
        
        if (sal < 500) {
            imp = sal * 0.05;
        } else if (sal >= 500 && sal <= 850) {
            imp = sal * 0.10;
        } else {
            imp = sal * 0.15;
        }
        
        System.out.println("Imposto a ser pago: " + imp);
    }
    
    public static void calcularNovoSalario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        double sal = scanner.nextDouble();
        double aum;
        
        if (sal > 1500) {
            aum = 25;
        } else if (sal >= 750 && sal <= 1500) {
            aum = 50;
        } else if (sal >= 450 && sal < 750) {
            aum = 75;
        } else {
            aum = 100;
        }
        
        double novo_sal = sal + aum;
        System.out.println("Novo salário: " + novo_sal);
    }
    
    public static void classificarSalario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        double sal = scanner.nextDouble();
        
        if (sal <= 700) {
            System.out.println("Classificação: Mal Remunerado");
        } else {
            System.out.println("Classificação: Bem Remunerado");
        }
    }
}
