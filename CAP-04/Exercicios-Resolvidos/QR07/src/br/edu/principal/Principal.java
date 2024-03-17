package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A,B,C,I;
		
		System.out.println("Digite um valor para A: ");
		A = in.nextInt();
		System.out.println("Digite um valor para B: ");
		B = in.nextInt();
		System.out.println("Digite um valor para C: ");
		C = in.nextInt();
		System.out.println("Digite um valor para I (1, 2 ou 3):");
		I = in.nextInt();
		
		if(I == 1) {
			if(A < B && A < C) {
				if(B < C) {
					System.out.println("A ordem crescente dos numeros e: " + A + " " + B + " " + C);
				}else {
					System.out.println("A ordem crescente dos numeros e: " + A + " " + C + " " + B);
				}
			}if(B < A && B < C) {
				if (A < C) {
					System.out.println("A ordem crescente dos numeros e: " + B + " " + A + " " + C);
				}else {
					System.out.println("A ordem crescente dos numeros e: " + B + " " + C + " " + A);
				}
			}if(C < A && C < B) {
				if(A < B) {
					System.out.println("A ordem crescente dos numeros e: " + C + " " + A + " " + B);
				}else {
					System.out.println("A ordem crescente dos numeros e: " + C + " " + B + " " + A);
				}
			}
		}
		if(I == 2) {
			if(A > B && A > C) {
				if(B > C) {
					System.out.println("A ordem decrescente dos numeros e: " + A + " " + B + " " + C);
				}else {
					System.out.println("A ordem decrescente dos numeros e: " + A + " " + C + " " + B);
				}
			}if(B > A && B > C) {
				if(A > C) {
					System.out.println("A ordem decrescente dos numeros e: " + B + " " + A + " " + C);
				}else {
					System.out.println("A ordem decrescente dos numeros e: " + B + " " + C + " " + A);
				}
			}if( C > A && C > B) {
				if(A > B) {
					System.out.println("A ordem decrescente dos numeros e: " + C + " " + A + " " + B);
				}else {
					System.out.println("A ordem decrescente dos numeros e: " + C + " " + B + " " + A);
				}
			}
		}
		if(I == 3) {
			if(A > B && A > C) {
				System.out.println("A ordem desejada dos numeros e: " + B + " " + A + " " + C);
			}if(B > A && B > C) {
				System.out.println("A ordem desejada dos numeros e: " + A + " " + B + " " + C);
			}if(C > A && B > C) {
				System.out.println("A ordem desejada dos numeros e: " + A + " " + C + " " + B);
			}
			
		}
	
		}	 
	}


