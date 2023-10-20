package lista3;
import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
			double salario, minimo, calculo;
		
		System.out.println("Entre com seu salário");
			salario= in.nextDouble();
			minimo=1302;
			calculo=salario/1302;
		System.out.println("Você ganha "+calculo+" salários mínimos.");
		
		if(calculo>=1) {
			System.out.println("Você ganha um salário adequado");
		}else {
			System.out.println("Você ganha um salário inadequado");
		}
	}
}
