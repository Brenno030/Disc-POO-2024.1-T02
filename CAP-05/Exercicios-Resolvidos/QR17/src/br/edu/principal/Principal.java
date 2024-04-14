package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salCarlos, salJoao;
        int meses = 0;

        System.out.print("Digite o salário de Carlos: ");
        salCarlos = scanner.nextDouble();
        
        salJoao = salCarlos / 3.0;

        while (salJoao < salCarlos) {
            salCarlos += salCarlos * 0.02; 
            salJoao += salJoao * 0.05; 
            meses++;
        }

        System.out.println("Quantidade de meses necessários: " + meses);
    }
}
