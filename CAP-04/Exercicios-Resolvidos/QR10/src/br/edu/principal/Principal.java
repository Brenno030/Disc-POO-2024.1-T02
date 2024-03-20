package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int d1,m1,a1,d2,m2,a2;
		
		System.out.println("'Digite a primeira data:");
		System.out.println("Dia:");
		d1 = in.nextInt();
		
		System.out.println("Mes:");
		m1 = in.nextInt();
		
		System.out.println("Ano:");
		a1 = in.nextInt();
		
		System.out.println("Digite a segunda data:");
		System.out.println("Dia:");
		d2 = in.nextInt();
		
		System.out.println("Mes:");
		m2 = in.nextInt();
		
		System.out.println("Ano:");
		a2 = in.nextInt();
		
		if (a1 > a2) {
		System.out.println("A maior data é:" + d1 + " " + m1 + " " + a1);	
		
		}else if(a2 > a1) {
			System.out.println("A maior data é:" + d2 + " " + m2 + " " + a2);
			 if(m1 > m2) {
				 System.out.println("A maior data é:" + d1 + " " + m1 + " " + a1);	
				 if(m2 > m1) {
					 System.out.println("A maior data é:" + d2 + " " + m2 + " " + a2);
					 if(d1 > d2) {
						 System.out.println("A maior data é:" + d1 + " " + m1 + " " + a1);	
							if(d2 > d1) {
								System.out.println("A maior data é:" + d2 + " " + m2 + " " + a2);
							}
					 }
				 }
			 }
		}else {
			System.out.println("As datas são iguais!");
		}
	}

}
