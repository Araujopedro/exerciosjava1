package exerclogfact;
import java.util.Scanner;
//9) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
//Calcular e escrever o valor do novo salário.
public class exerci9 {

	public static void main(String[] args) {
System.out.println("digite o salario mensal ");
Scanner sc= new Scanner(System.in);
float slarioatu= sc.nextFloat();
System.out.println("percentegaem de reajuste");
 float reajuste= sc.nextFloat();
 float salarioFim =reajuste/100*slarioatu+slarioatu;
 System.out.println("novo salario R$"+salarioFim );
 sc.close();
 
 
		
		
	}

}
