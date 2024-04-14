package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Informe o ano atual: ");
	int anoAtual = scanner.nextInt();
	int anoContrtacao = 2005;
	double salario = 1000.0;
	double percentual = 1.5 / 100.0;
	
	
	double novoSalario = salario + percentual * salario;
	
	for (int ano= 2007; ano <= anoAtual; ano++) {
	 percentual *= 2;
	 novoSalario += percentual * novoSalario;
	
	}
	
	System.out.println("O salário atual do funcionario em " + anoAtual + " é ; R$" + novoSalario);
	}
}
