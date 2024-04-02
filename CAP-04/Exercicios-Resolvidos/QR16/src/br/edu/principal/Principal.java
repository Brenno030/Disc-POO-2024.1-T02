package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int pre,venda,novoPre;
    
    System.out.println("Digite a venda media mensal:");
    venda = in.nextInt();
    System.out.println("Digite o preco atual:");
    pre = in.nextInt();
    
    if(venda > 500 | pre <30) {
    	novoPre = pre + 10/100 *pre;
    }else if(venda >= 500 && venda < 1200 | pre >= 30 && pre <80){ 
    	novoPre = pre + 15/100 * pre;
    }else if(venda >= 1200 | pre >= 80) {
    	novoPre = pre - 20/100 * pre;
    }else {
    	novoPre = pre;
    }
    System.out.println("o novo preco e:" + novoPre);
  
	}

}
