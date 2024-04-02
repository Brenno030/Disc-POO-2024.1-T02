package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sal, novoSal, boni, aux;
		
		System.out.println("Digite o salario:");
		sal = in.nextInt();
		
		if(sal <= 500) {
			boni = sal *5/100;
			}else if(sal <= 1200) {
				boni = sal * 5/100;	
				}else {
					boni = 0;
			}if(sal <= 600) {
				aux = 150;
			}else {
				aux = 100;
			}novoSal = sal + boni + aux;
			System.out.println(novoSal);
		}

	}


