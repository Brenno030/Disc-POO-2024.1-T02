package br.edu.principal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Principal {

	public static void main(String[] args) {
		 LocalDateTime now = LocalDateTime.now();
	        int dia = now.getDayOfMonth();
	        int mes = now.getMonthValue();
	        int ano = now.getYear();
	        int hora = now.getHour();
	        int min = now.getMinute();

	        String mesExtenso = "";
	        switch (mes) {
	            case 1:  mesExtenso = "janeiro"; break;
	            case 2:  mesExtenso = "fevereiro"; break;
	            case 3:  mesExtenso = "março"; break;
	            case 4:  mesExtenso = "abril"; break;
	            case 5:  mesExtenso = "maio"; break;
	            case 6:  mesExtenso = "junho"; break;
	            case 7:  mesExtenso = "julho"; break;
	            case 8:  mesExtenso = "agosto"; break;
	            case 9:  mesExtenso = "setembro"; break;
	            case 10: mesExtenso = "outubro"; break;
	            case 11: mesExtenso = "novembro"; break;
	            case 12: mesExtenso = "dezembro"; break;
	        }

	        System.out.println("Data Atual: " + dia + "/" + mes + "/" + ano + " - " + mesExtenso);
	        System.out.println("Hora Atual: " + hora + ":" + min);
	    }
	
	   
	}


