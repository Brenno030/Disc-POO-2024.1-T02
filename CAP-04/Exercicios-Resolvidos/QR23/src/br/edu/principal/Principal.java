package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salMin, nht, coeficiente, salBruto, imposto, grat, auxilio, salLiq;
        String turno, categoria;

        System.out.println("Digite o salario minimo:");
        salMin = input.nextDouble();

        System.out.println("Digite o turno de trabalho (M - Manhã, V - Tarde, N - Noite):");
        turno = input.next();

        System.out.println("Digite a categoria (O - Operário, E - Escriturário):");
        categoria = input.next();

        System.out.println("Digite o numero de horas trabalhadas:");
        nht = input.nextDouble();

        if (turno.equals("M")) {
            coeficiente = 10.0 / 100 * salMin;
        } else if (turno.equals("V")) {
            coeficiente = 15.0 / 100 * salMin;
        } else {
            coeficiente = 12.0 / 100 * salMin;
        }
        System.out.println("O coeficiente é: " + coeficiente);

        salBruto = nht * coeficiente;
        System.out.println("O salario bruto é: " + salBruto);

        if (categoria.equals("O")) {
            if (salBruto >= 300) {
                imposto = 5.0 / 100 * salBruto;
            } else {
                imposto = 3.0 / 100 * salBruto;
            }
        } else {
            if (salBruto >= 400) {
                imposto = 6.0 / 100 * salBruto;
            } else {
                imposto = 4.0 / 100 * salBruto;
            }
        }
        System.out.println("O valor do imposto é: " + imposto);

        if (turno.equals("N") && nht > 80) {
            grat = 50;
        } else {
            grat = 30;
        }
        System.out.println("A gratificação é: " + grat);

        if (categoria.equals("O") || coeficiente <= 25) {
            auxilio = 1.0 / 3 * salBruto;
        } else {
            auxilio = 1.0 / 2 * salBruto;
        }
        System.out.println("O auxilio é: " + auxilio);

        salLiq = salBruto - imposto + grat + auxilio;
        System.out.println("O salario liquido é: " + salLiq);

        if (salLiq < 350) {
            System.out.println("Mal Remunerado");
        } else if (salLiq >= 350 && salLiq <= 600) {
            System.out.println("Normal");
        } else {
            System.out.println("Bem Remunerado");
        }

        input.close();
    }
}
