package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1,num2,num3,num4;
		
		System.out.println("Digite tres numeros em ordem crescente.");
		System.out.println("Primeiro numero: ");
		num1 = in.nextInt();
		System.out.println("Segundo numero:");
		num2 = in.nextInt();
		System.out.println("Terceiro numero:");
		num3 = in.nextInt();
		
		System.out.println("Digite um numero (fora da ordem): ");
		num4 = in.nextInt();
		
		if(num4 > num3){
			System.out.println("A ordem decrescente e: " + num4 + " " + num3 + " " + num2 + " " + num1);
			
		}if(num4 > num2 && num4 < num3) {
			System.out.println("A ordem decrescente e: " + num3 + " " + num4 + " " + num2 + " " + num1);
			
		}if(num4 > num1 && num4 < num2) {
			System.out.println("A ordem decrescente e: " + num3 + " " + num2 + " " + num4 + " " + num1);
		}if(num4 < num1) {
			System.out.println("A ordem decrescente e: " + num3 + " " + num2 + " " + num1 + " " + num4);
		}
		

	}

}
