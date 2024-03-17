package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1,num2; 
		
		System.out.println("Digite o primeiro numero: ");
	    num1 = in.nextInt();
	    
		System.out.println("Digite o segundo numero: ");
	    num2 = in.nextInt();
	    
	    if(num1 > num2 ){
	    	System.out.println("O maior numero e " + num1);
	    }if(num2 > num1) {
	    	System.out.println("O maior numero e " + num2);
	    }if(num2 == num1) {
	    	System.out.println("Os numeros sao iguais");
	}

   }
}
