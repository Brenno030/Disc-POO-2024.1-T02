package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int senha,acesso;
    
    System.out.println("Digite a senha para acessar:");
    acesso = in.nextInt();
    
    senha = 4531;
    
    if(acesso == senha) {
    	System.out.println("Acesso liberado");
    }else { 
    	System.out.println("Acesso negado");
    }
    
	}

}
