package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preco, imp, transp, seguro, finalPrice, totalImp = 0;
        int origem;
        char meioT, carga;

        System.out.println("Digite o preço unitário do produto:");
        preco = scanner.nextDouble();

        while (preco > 0) {
            System.out.println("Digite o país de origem (1 – Estados Unidos; 2 — México; 3 — outros):");
            origem = scanner.nextInt();

            System.out.println("Digite o meio de transporte (T — terrestre; F — fluvial; A — aéreo):");
            meioT = scanner.next().charAt(0);

            System.out.println("Carga perigosa (S — sim; N — não):");
            carga = scanner.next().charAt(0);

            if (preco <= 100) {
                imp = preco * 0.05;
            } else {
                imp = preco * 0.10;
            }

            if (carga == 'S') {
                switch (origem) {
                    case 1:
                        transp = 50;
                        break;
                    case 2:
                        transp = 21;
                        break;
                    case 3:
                        transp = 24;
                        break;
                    default:
                        transp = 0;
                        break;
                }
            } else {
                switch (origem) {
                    case 1:
                        transp = 12;
                        break;
                    case 2:
                        transp = 21;
                        break;
                    case 3:
                        transp = 60;
                        break;
                    default:
                        transp = 0;
                        break;
                }
            }

            if (origem == 2 || meioT == 'A') {
                seguro = preco / 2;
            } else {
                seguro = 0;
            }

            finalPrice = preco + imp + transp + seguro;
            totalImp += imp;

            System.out.println("Valor do imposto: " + imp);
            System.out.println("Valor do transporte: " + transp);
            System.out.println("Valor do seguro: " + seguro);
            System.out.println("Preço final: " + finalPrice);

            System.out.println("Digite o preço unitário do produto (digite 0 para encerrar):");
            preco = scanner.nextDouble();
        }

        System.out.println("Total dos impostos: " + totalImp);
        
    }
}
