package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int codigo,quantidade;
    double desconto,preco,preTotal,precoUni,preDesconto;
    
    System.out.println("Digite o codigo do produto(1 a 40):");
    codigo = in.nextInt();
    System.out.println("Digite a quantidade:");
    quantidade = in.nextInt();
    
    if(codigo >= 1 && codigo <= 10) {
    	precoUni = 10;
    	System.out.println("O valor do produto e:" + precoUni);
    	preTotal = precoUni * quantidade;
    	System.out.println("O preco total da nota:" + preTotal);
    	if(preTotal <= 250) {
    		desconto = (preTotal/100) *5;
    		System.out.println("O valor do desconto:" + desconto);
    		preDesconto = preTotal - desconto;
    		System.out.println("O valor total com desconto:" + preDesconto);    	}if(preTotal > 250 && preTotal <= 500) {
    		desconto = (preTotal/100) *10;
    		System.out.println("O valor do desconto:" + desconto);
    		preDesconto = preTotal - desconto;
    		System.out.println("O valor total com desconto:" + preDesconto);    	}if(preTotal > 250 && preTotal <= 500) {
    	}if(preTotal > 500) {
    		desconto = (preTotal/100) *15;
    		System.out.println("O valor do desconto:" + desconto);
    		preDesconto = preTotal - desconto;
    		System.out.println("O valor total com desconto:" + preDesconto);    	}if(preTotal > 250 && preTotal <= 500) {

    	}
    
    }else if(codigo > 11 && codigo <= 20) {
    	precoUni = 15;
    	preTotal = precoUni * quantidade;
    	if(preTotal <= 250) {
    		desconto = (preTotal/100) *5;
    		System.out.println("O valor do desconto:" + desconto);
    		preDesconto = preTotal - desconto;
    		System.out.println("O valor total com desconto:" + preDesconto);    	}if(preTotal > 250 && preTotal <= 500) {
    		desconto = (preTotal/100) *10;
    		System.out.println("O valor do desconto:" + desconto);
    		preDesconto = preTotal - desconto;
    		System.out.println("O valor total com desconto:" + preDesconto);    	}if(preTotal > 250 && preTotal <= 500) {
    	}if(preTotal > 500) {
    		desconto = (preTotal/100) *15;
    		System.out.println("O valor do desconto:" + desconto);
    		preDesconto = preTotal - desconto;
    		System.out.println("O valor total com desconto:" + preDesconto);    	}if(preTotal > 250 && preTotal <= 500) {

    	}
    }else if(codigo >= 21 && codigo <= 30) {
    	precoUni = 20;
    	preTotal = precoUni * quantidade;
    	if(preTotal <= 250) {
    		desconto = (preTotal/100) *5;
    		System.out.println("O valor do desconto:" + desconto);
    		preDesconto = preTotal - desconto;
    		System.out.println("O valor total com desconto:" + preDesconto);    	}if(preTotal > 250 && preTotal <= 500) {
    		desconto = (preTotal/100) *10;
    		System.out.println("O valor do desconto:" + desconto);
    		preDesconto = preTotal - desconto;
    		System.out.println("O valor total com desconto:" + preDesconto);    	}if(preTotal > 250 && preTotal <= 500) {
    	}if(preTotal > 500) {
    		desconto = (preTotal/100) *15;
    		System.out.println("O valor do desconto:" + desconto);
    		preDesconto = preTotal - desconto;
    		System.out.println("O valor total com desconto:" + preDesconto);    	}if(preTotal > 250 && preTotal <= 500) {

    	}
    }else if(codigo >= 31 && codigo <= 40) {
    	precoUni = 30;
    	preTotal = precoUni * quantidade;
    	if(preTotal <= 250) {
    		desconto = (preTotal/100) *5;
    		System.out.println("O valor do desconto:" + desconto);
    		preDesconto = preTotal - desconto;
    		System.out.println("O valor total com desconto:" + preDesconto);    	}if(preTotal > 250 && preTotal <= 500) {
    		desconto = (preTotal/100) *10;
    		System.out.println("O valor do desconto:" + desconto);
    		preDesconto = preTotal - desconto;
    		System.out.println("O valor total com desconto:" + preDesconto);    	}if(preTotal > 250 && preTotal <= 500) {
    	}if(preTotal > 500) {
    		desconto = (preTotal/100) *15;
    		System.out.println("O valor do desconto:" + desconto);
    		preDesconto = preTotal - desconto;
    		System.out.println("O valor total com desconto:" + preDesconto);    	}if(preTotal > 250 && preTotal <= 500) {

    	}
	}else {
		System.out.println("Esse produto nao existe!!!");
	}
	}
}


