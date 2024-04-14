package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_termos, num1 = 2, num2 = 7, num3 = 3;

        System.out.print("Digite o número de termos: ");
        num_termos = scanner.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        for (int i = 4; i <= num_termos; i++) {
            num1 *= 2;
            System.out.println(num1);

            if (++i <= num_termos) {
                num2 *= 3;
                System.out.println(num2);
            }

            if (++i <= num_termos) {
                num3 *= 4;
                System.out.println(num3);
            }
        }
    }
}
