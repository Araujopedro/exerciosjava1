package exerclogfact;
import java.util.Scanner;
//10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
//distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
//seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
//calcular e escrever o custo final ao consumidor.

public class exercico10 {

	public static void main(String[] args) {
		System.out.println("custo da fabrica");
		Scanner sc= new Scanner (System.in);
		float custofab= sc.nextFloat();
		float CC = custofab* 45/100 +custofab*28/100+ custofab;
		System.out.println("valor final do carro para o consumidor é de R$"+CC);
		sc.close();
				
		
		
		
		
		
		
		
		
		
	}

}
