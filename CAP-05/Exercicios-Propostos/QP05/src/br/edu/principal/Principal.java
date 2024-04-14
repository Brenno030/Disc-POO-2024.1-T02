package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lucroTotal = 0;
        int acoesLucroMais1000 = 0;
        int acoesLucroMenos200 = 0;

        while (true) {
            System.out.print("Digite o tipo da ação (ou 'F' para finalizar): ");
            char tipoAcao = scanner.next().charAt(0);

            if (tipoAcao == 'F') {
                break;
            }

            System.out.print("Digite o preço de compra da ação: ");
            double precoCompra = scanner.nextDouble();
            System.out.print("Digite o preço de venda da ação: ");
            double precoVenda = scanner.nextDouble();

            int lucro = (int) (precoVenda - precoCompra);
            lucroTotal += lucro;

            if (lucro > 1000) {
                acoesLucroMais1000++;
            }

            if (lucro < 200) {
                acoesLucroMenos200++;
            }

            System.out.println("Lucro da ação: R$ " + lucro);
        }

        System.out.println("Quantidade de ações com lucro superior a R$ 1.000,00: " + acoesLucroMais1000);
        System.out.println("Quantidade de ações com lucro inferior a R$ 200,00: " + acoesLucroMenos200);
        System.out.println("Lucro total da empresa: R$ " + lucroTotal);
    }
    }
    
