package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int angulo,voltas;
    
    System.out.println("Digite o valor do angulo:");
    angulo = in.nextInt();
    
    if(angulo > 360 | angulo < -360) {
    	voltas = angulo / 360;
    	angulo = (angulo % 360);  

    }    else {
    	   voltas = 0;
    }
    if(angulo == 0 | angulo == 90 | angulo == 180 | angulo == 270 | angulo == 360 | angulo == -90 | angulo == -180 | angulo == -270 | angulo == -360) {
    	System.out.println("Esta em cima de algum dos eixos");
    }if ((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)){
    	System.out.println("primeiro quadrante");
    }if((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) {
    	System.out.println("segundo quadrante");
    }if((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
    	System.out.println("terceiro quadrante");
    }if((angulo > 270 && angulo < 360) || (angulo < 0 && angulo > -90)) {
    	System.out.println("quarto quadrante");
    }System.out.println(voltas + " voltas(s) no sentido ");
    if(angulo < 0 ) {
    	System.out.println("Horario");
    }else {
    	System.out.println("Anti-Horario");
    }
    }
    		
	}


