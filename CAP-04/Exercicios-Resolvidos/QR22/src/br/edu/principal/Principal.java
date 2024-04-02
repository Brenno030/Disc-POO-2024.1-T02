package br.edu.principal;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int salLiq, salBase, tempo, imposto, grat = 0;

        System.out.println("Digite o salario base:");
        salBase = in.nextInt();
        System.out.println("Digite o tempo de servico:");
        tempo = in.nextInt();

        if (salBase < 200) {
            imposto = 0;
        } else if (salBase <= 450) {
            imposto = (int) (3.0 / 100 * salBase);
        } else if (salBase < 700) {
            imposto = (int) (8.0 / 100 * salBase);
        } else {
            imposto = (int) (12.0 / 100 * salBase);
        }
        System.out.println("O valor do imposto e:RS" + imposto);

        if (salBase > 500) {
            if (tempo <= 3) {
                grat = 20;
            } else {
                grat = 30;
            }
        } else {
            if (tempo <= 3) {
                grat = 23;
            } else if (tempo < 6) {
                grat = 35;
            } else {
                grat = 33;
            }
        }

        salLiq = salBase - imposto + grat;
        System.out.println("O valor do salario liquido e:" + salLiq);

        if (salLiq < 350) {
            System.out.println("Classificacao A");

        } else if (salLiq < 600) {
            System.out.println("Classificacao B");
        } else {
            System.out.println("Classificacao C");
        }

        in.close();
    }
}
