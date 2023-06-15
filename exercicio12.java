package exerclogfact;
import java.util.Scanner;

//12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
//correspondente em graus Celsius (baseado na fórmula abaixo):
//C              F - 32
//---------- = -----------
//5                 9
//Observação: Para testar se a sua resposta está correta saiba que 100oC = 212F
public class exercicio12 {

	
	
	public static void main(String[] args) {
System.out.println("temperatura em Fahrenheit");
Scanner sc= new Scanner (System.in);
float TempF= sc.nextFloat();
Float tempC= (TempF-32)*5/9 ;
System.out.println("temperatura em celsius"+ tempC);
sc.close();
	}

}
