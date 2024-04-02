package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    double x,y,z;
    
    System.out.println("Tipos de triangulo");
    System.out.println("Digite o valor de X:");
    x = in.nextDouble();
    System.out.println("Digite o valor de Y:");
    y = in.nextDouble();
    System.out.println("Digite o valor de Z:");
    z = in.nextDouble();
    
    if(x < y + z && y < x + z && z < x + y) {
    	if(x == y && y == z) {
    		System.out.println("Triangulo Equilatero");
    	}else if(x == y && x == z | y == z) {
    		System.out.println("Triangulo Isosceles");
    	}else if(x != y && x != z && y != z) {
    		System.out.println("Triangulo Escaleno");
    	}else {
    		System.out.println("Essas medidas nao formam um triangulo");
    	}
    }
    
	}

}
