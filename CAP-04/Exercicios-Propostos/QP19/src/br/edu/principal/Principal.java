package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sexo;
        double altura, pesoIdeal;

        System.out.println("Calcule e mostre seu peso ideal.");
        System.out.println("Digite o sexo:");
        System.out.println("[1] - Masculino");
        System.out.println("[2] - Feminino");
        sexo = in.nextInt();

        if (sexo == 1) {
            System.out.println("Digite sua altura em centímetros(Exe:170):");
            altura = in.nextDouble();
            altura = altura/100;
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal para homens é: %.2f kg%n", pesoIdeal);
        } else if (sexo == 2) {
            System.out.println("Digite sua altura em centímetros(Exe:170):");
            altura = in.nextDouble();
            altura = altura / 100;
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("O peso ideal para mulheres é: %.2f kg%n", pesoIdeal);
        } else {
            System.out.println("Opção inválida. Por favor, escolha 1 para Masculino ou 2 para Feminino.");
        }
    }

}
