package br.edu.principal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double pre, valorAdic = 0, imposto, preCusto, desconto, novoPre;
        String tipo, refrig;

        System.out.println("Digite o preco:");
        pre = in.nextDouble();
        System.out.println("Digite o tipo do produto:");
        tipo = in.next();

        System.out.println("Digite nivel de Refrigeraçao do produto.");
        System.out.println("[S] - produto que necessita de refirger\n"
                + "[N] - Produto que nao necessita de refrigeraçao");
        refrig = in.next();

        if (refrig.equals("N")) {
            if (tipo.equals("A")) {
                if (pre < 15) {
                    valorAdic = 2;
                } else {
                    valorAdic = 5;
                }
            }
            if (tipo.equals("L")) {
                if (pre < 10) {
                    valorAdic = 1.50;
                } else {
                    valorAdic = 2.50;
                }
            }
            if (tipo.equals("V")) {
                if (pre < 30) {
                    valorAdic = 3;
                } else {
                    valorAdic = 2.5;
                }
            }
        } else {
            if (tipo.equals("A")) {
                valorAdic = 8;
            }
            if (tipo.equals("L")) {
                valorAdic = 0;
            }
            if (tipo.equals("V")) {
                valorAdic = 0;
            }
        }

        // Removido valorAdic = in.nextDouble();, pois a variável já foi atribuída acima

        System.out.println("Valor Adicional: " + valorAdic);

        if (pre < 25) {
            imposto = 5.0 / 100 * pre;
        } else {
            imposto = 8.0 / 100 * pre;
        }
        System.out.println("O valor do imposto e:" + imposto);

        preCusto = pre + imposto;
        System.out.println("O valor do preCusto e:" + preCusto);

        if (!tipo.equals("A") && !tipo.equals("S")) {
            desconto = 3.0 / 100 * preCusto;
        } else {
            desconto = 0;
        }
        System.out.println("O valor do desconto e:" + desconto);

        novoPre = preCusto + valorAdic - desconto;
        System.out.println("O novo preco do produto e:" + novoPre);

        if (novoPre <= 50) {
            System.out.println("Barato");
        } else if (novoPre < 100) {
            System.out.println("Normal");
        } else {
            System.out.println("Caro");
        }
    }
}
