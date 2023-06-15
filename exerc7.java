package exerclogfact;

import java.util.Scanner;
//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

public class exerc7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("qual sua idade em anos?");
		int idadeAnos =sc.nextInt();
		int idadeQvem = idadeAnos+1;
	    System.out.println(" Quantos meses faltam para voce fazer "+ idadeQvem + " anos ");
        int idadeMeses = sc.nextInt();
		System.out.println(" Quantos dias faltam para voce chegar na data em que faz "+ idadeQvem + " anos ");
	    int idadeDias = sc.nextInt();
	    int suaIdade = idadeAnos*365+ idadeDias + idadeMeses*30;
	  
	    System.out.println(suaIdade);
	    sc.close();
	   
	    
		
	}

}
