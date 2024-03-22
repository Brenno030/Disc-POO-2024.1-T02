package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int salario, aumento, novoSal, cargo;
		System.out.println("[1] - Escrituario\n"
				+ "[2] - Secretario\n[3] - Caixa\n"
				+ "[4] - Gerente\n"
				+ "[5] - Diretor");
		System.out.println("Digite o cargo do funcionário (1, 2, 3 ,4 ou 5)");
	    cargo = in.nextInt();
	    System.out.println("Digite o valor do salario: ");
	    salario = in.nextInt();
	    
	   
	    if(cargo == 1) {
	    	System.out.println("O cargo é Escrituário");
	    	aumento = (salario * 50/100);
	    	System.out.println("O valor do aumento é: " + aumento);
	    	novoSal = salario + aumento;
	    	System.out.println("O novo salario é:" + novoSal);
	    	
	    }else if(cargo == 2) {
	    	System.out.println("O cargo é Secretario");
	    	aumento = salario*35/100;
	    	System.out.println("O valor do aumento é: " + aumento);
	    	novoSal = salario + aumento;
	    	System.out.println("O novo salario e:" + novoSal);
	    	
	    }else if(cargo == 3) {
	    	System.out.println("O cargo e caixa");
	    	aumento = salario*20/100;
	    	System.out.println("O valor do aumento e: " + aumento);
	    	novoSal = salario + aumento;
	    	System.out.println("O novo salario e:" + novoSal);
	    	
	    }else if(cargo == 4) {
	    	System.out.println("O cargo e Gerente");
	    	aumento = salario*10/100;
	    	System.out.println("O valor do aumento e: " + aumento);
	    	novoSal = salario + aumento;
	    	System.out.println("O novo salario e:" + novoSal);
	    	
	    }else if(cargo == 5) {
	    	System.out.println("O cargo e Diretor");
	    	System.out.println("O salario do Diretor e:" + salario);
	    	
	    }else {
	    	System.out.println("Cargo inexistente !");
	    }
	}
}
	    	
	    

	    


