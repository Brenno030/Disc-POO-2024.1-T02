package br.edu.principal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int codEst, codCarga, pesoKg, pesoTonel, preCarga, valorTotal, impostos;

        System.out.println("Digite o codigo do estado:");
        codEst = in.nextInt();

        System.out.println("Digite o peso do produto(Toneladas):");
        pesoKg = in.nextInt();
        pesoTonel = pesoKg * 1000;
        System.out.println("O peso do produto(Kg) e:" + pesoKg);

        System.out.println("Digite o codigo da carga:");
        codCarga = in.nextInt();

        if (codCarga >= 10 && codCarga <= 20) {
            preCarga = 100 * pesoTonel;
        } else if (codCarga >= 21 && codCarga <= 30) {
            preCarga = 250 * pesoTonel;
        } else if (codCarga >= 31 && codCarga <= 40) {
            preCarga = 340 * pesoTonel;
        } else {
            preCarga = 0; // Valor padrão se o código de carga for inválido
        }
        System.out.println("o preco da carga e:RS" + preCarga);

        if (codEst == 1) {
            impostos = (35 * preCarga) / 100;
        } else if (codEst == 2) {
            impostos = (25 * preCarga) / 100;
        } else if (codEst == 3) {
            impostos = (15 * preCarga) / 100;
        } else if (codEst == 4) {
            impostos = (5 * preCarga) / 100;
        } else if (codEst == 5) {
            impostos = 0;
        } else {
            impostos = 0; // Valor padrão se o código do estado for inválido
        }
        System.out.println("O valor do imposto e:RS" + impostos);
        valorTotal = preCarga + impostos;

        System.out.println("O valor total do produto e:RS" + valorTotal);

        in.close();
    }
}
