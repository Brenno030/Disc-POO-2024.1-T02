package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pessoasMaisDe50 = 0;
        double somaAlturas = 0;
        int countAlturas = 0;
        int pessoasMenos40Kg = 0;
        int totalPessoas = 5;

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            System.out.print("Peso (em kg): ");
            double peso = scanner.nextDouble();

            if (idade > 50) {
                pessoasMaisDe50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                countAlturas++;
            }

            if (peso < 40) {
                pessoasMenos40Kg++;
            }
        }

        System.out.println("Quantidade de pessoas com mais de 50 anos: " + pessoasMaisDe50);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + (countAlturas != 0 ? somaAlturas / countAlturas : "Nenhuma pessoa com idade entre 10 e 20 anos"));
        System.out.println("Porcentagem de pessoas com peso inferior a 40 kg: " + (pessoasMenos40Kg * 100 / totalPessoas) + "%");
    }
}
