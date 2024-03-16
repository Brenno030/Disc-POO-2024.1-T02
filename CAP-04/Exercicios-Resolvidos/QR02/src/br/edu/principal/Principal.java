package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n1,n2,n3,media,exame;
	
	System.out.println("digite a primeira nota: ");
	n1 = in.nextInt();
	
	System.out.println("digite a segunda nota: ");
	n2 = in.nextInt();
	
	System.out.println("digite a terceira nota: ");
	n3 = in.nextInt();
	
	media = (n1 + n2 + n3)/3;
	System.out.println("Sua Media aritmédica foi: "+ media);
	
	
	
	if(media >= 0 && media <3) {
		System.out.println("Sua nota foi "+ media + "Voce foi Reprovado");
	}if(media >=3 && media <7){
		System.out.println("Voce vai para o Exame Final");
		exame = 12 - media;
		System.out.println("Deve tirar nota " + exame + " para ser aprovado"); 
	}if(media >= 7 && media <= 10){
		System.out.println("Sua nota foi " + media + " Aprovado");
	}
	}

}
