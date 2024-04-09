package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    double sal, aumento;
    
    System.out.println("Calcule seu aumento");
    System.out.println("Digite seu salario:");
    sal = in.nextDouble();
    
    if(sal <= 300) {
    	aumento = (sal / 100) * 50;
    	sal = aumento + sal;
    	System.out.println("O seu novo salario e:" + sal);
    }else if(sal > 300 && sal <= 500) {
    	aumento = (sal /100) * 40;
    	sal = aumento + sal;
    	System.out.println("O seu novo salario e:" + sal);
    }else if(sal > 500 && sal <= 700) {
    	aumento = (sal /100) * 30;
    	sal = aumento + sal;
    	System.out.println("O seu novo salario e:" + sal);
    }else if(sal > 700 && sal <= 800) {
    	aumento = (sal /100) * 20;
    	sal = aumento + sal;
    	System.out.println("O seu novo salario e:" + sal);
    }else if(sal > 800 && sal <= 1000) {
    	aumento = (sal /100) * 10;
    	sal = aumento + sal;
    	System.out.println("O seu novo salario e:" + sal);
    }else if (sal > 1000) {
    	aumento = (sal /100) * 40;
    	sal = aumento + sal;
    	System.out.println("O seu novo salario e:" + sal);
    }
    
	}

}
