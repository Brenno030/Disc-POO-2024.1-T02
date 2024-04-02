package br.edu.principl;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
       int vhe ,salMin, nht, ndep, nhet, imp = 0, sbruto, sliq, grat = 0, vh, smes,
       vdep, salReceber;
       
    
       System.out.println("Digite o Salario minimo:");
       salMin = in.nextInt();
       
       System.out.println("Digite o numeros de horas trabalhadas:");
       nht = in.nextInt();
       
       System.out.println("Digite o numero de dependentes:");
       ndep = in.nextInt();
       
       System.out.println("Digite a quantidade de horas extras:");
       nhet = in.nextInt();
       
       vh = 1/5 * salMin;
       smes = vh * nht;       
       vdep = 32 * ndep;
       vhe = nhet *(vh + (vh * 50/100));
       sbruto = smes + vdep + vhe;
       
       if(sbruto < 200) {
    	   imp = 0;
       }if(sbruto >= 200 && sbruto <= 500) {
    	   imp = sbruto * 10/100;
       }if(sbruto > 500) {
    	   imp = sbruto * 20/100;
       }   
       sliq = sbruto - imp;
       if(sliq <= 350) {
    	   grat = 100;
       }if(sliq > 350) {
    	   grat = 50;
       }salReceber = sliq + grat;
       			
       System.out.println(salReceber);
	}

}
