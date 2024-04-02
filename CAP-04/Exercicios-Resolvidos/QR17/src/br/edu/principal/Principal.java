package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int a,b,c,delta;
    double x1,x2;
    
    System.out.println("Digite o valor de A:");
    a = in.nextInt();
    System.out.println("Digite o valor de B:");
    b = in.nextInt();
    System.out.println("Digite o valor de C:");
    c = in.nextInt();
    
    if(a == 0) {
    	System.out.println("Esses valores nao formam uma equacao de segundo grau!!!");
    }else {
    	delta = (b * b) - (4 * a * c);
    	if(delta < 0) {
    		System.out.println("Nao existe raiz!!!");
    	}if(delta == 0) {
    		System.out.println("Existe uma raiz real!!!");
    		x1 = (-b) / (2*a);
    		System.out.println("o valor da raiz e:" + x1);
    	}if(delta > 0) {
    		x1 = (- b + Math.sqrt(delta)) / (2 * a);
    		x2 = (- b - Math.sqrt(delta)) / (2 * a);
    		System.out.println("A raiz de x1 e:" + x1);
    		System.out.println("A raiz de x2 e:" + x2);
    		System.out.println("FIM");


    		

    		
    	}
    }
    
	}

}
