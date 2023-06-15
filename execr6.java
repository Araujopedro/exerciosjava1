package exerclogfact;
import java.util.Scanner;
//Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
//área do retângulo.


public class execr6 {

	public static void main(String[] args) {
		System.out.println("calcular area retangulo ");
		Scanner sc= new Scanner(System.in);
		System.out.println("altura");
		int altura = sc.nextInt();
		System.out.println("base");
		int base=sc.nextInt();
		int area= base*altura;
		System.out.println("a area do retangulo é "+ area);
		sc.close();
		
	}

}
