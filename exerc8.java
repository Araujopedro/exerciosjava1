package exerclogfact;
import java.util.Scanner;
//8) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
//brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
//de eleitores.
public class exerc8 {

	public static void main(String[] args) {
		System.out.println("Numero de eleitores do municipio de Mucuripe");
		Scanner sc = new Scanner(System.in);
		double numeroHabitantes= sc.nextDouble();
		System.out.println("numero de votos nulos");
		double nulos = sc.nextDouble();
		System.out.println("numero de votos brancos");
		double brancos = sc.nextDouble();
		System.out.println("numero de votos validos");
		double validos = sc.nextDouble();
		double percentualDenulos=nulos*100/numeroHabitantes;
		System.out.println("percentual de nulos foi de "+ percentualDenulos);
		double percentualDebrancos= brancos*100/numeroHabitantes;
		System.out.println("percentual de bracos foi de "+ percentualDebrancos);
		double percentualDevalidos= validos*100/numeroHabitantes;
		System.out.println("percentual de validos foi de "+ percentualDevalidos);
		sc.close();
	}

}
