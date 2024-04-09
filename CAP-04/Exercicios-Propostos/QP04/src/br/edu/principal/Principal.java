package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num1,num2, num3;
    
    System.out.println("um programa que receba três números e mostra o maior.");
    
    System.out.println("Digite o primeiro numero:");
    num1 = in.nextInt();
    
    System.out.println("Digite o segundo numero:");
    num2 = in.nextInt();
    
    System.out.println("Digite o terceiro numero:");
    num3 = in.nextInt();
    
    if(num1 > num2 && num1 > num3) {
    	System.out.println("O maior numero e:" + num1);
    }if(num2 > num1 && num2 > num3) {
    	System.out.println("O  maior numeor e:" + num2);
    }if(num3 > num1 && num3 > num2) {
    	System.out.println("O  maior numeor e:" + num3);
    }
	}

}
