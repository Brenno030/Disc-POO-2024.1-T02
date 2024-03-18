package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1,num2,soma,op;
		double raiz;
		
		System.out.println("------Menu------");
        System.out.println("[1] - Somar dois numeros");
        System.out.println("[2] - Raiz quadrada de numero");
        System.out.println("Digite sua opção: ");
        op = in.nextInt();
        
        if(op == 1) {
        	System.out.println("Digite o primeiro numero: ");
        	num1 = in.nextInt();
        	System.out.println("Digite o segundo numero: ");
        	num2 = in.nextInt();
        	
        	soma = (num1 + num2);
        	
        	System.out.println("A soma de " + num1 + " e " + num2 + " é " + soma);
        }
        if(op == 2) {
        	System.out.println("Digite um valor: ");
        	num1 = in.nextInt();
        	
        	raiz = (double) Math.sqrt(num1);
        	
        	System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
        }
        if(op != 1 && op != 2) {
        	System.out.println("Opção inválida!");
        }


	}

	
	}


