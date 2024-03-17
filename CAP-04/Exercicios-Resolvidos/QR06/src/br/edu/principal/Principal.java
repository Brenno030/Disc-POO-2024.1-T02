package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num,r;
		
		System.out.println("Digite um numero: ");
		num = in.nextInt();
		
		r = num % 2;
		
		if (r == 0) {
			System.out.println("O numero e par");
		}else {
			System.out.println("O numero e impar");
		}

	}

}
