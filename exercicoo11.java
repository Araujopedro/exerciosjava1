package exerclogfact;
import java.util.Scanner;
//11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
//mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
//efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
//vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
//vendedor
public class exercicoo11 {

	public static void main(String[] args) {
System.out.println("salario do vendedor");
Scanner sc = new Scanner (System.in);
float SFixo= sc.nextFloat();
System.out.println("quantidade de carros vendida");
int carrosVend= sc.nextInt();
System.out.println("comissão fixa por carro");
float CCf= sc.nextFloat();
System.out.println("total de vendas");
float totalVend =sc.nextInt();
double SFinal= SFixo+(CCf*carrosVend)+(0.05*totalVend);
System.out.println("valor final para o salario R$"+SFinal);
System.out.println("salario do vendedor "+ SFixo );
System.out.println("quantidade de carros vendida "+ carrosVend);
System.out.println("valor da comissão de carros "+ CCf );
 sc.close();
	}

}
