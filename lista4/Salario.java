package lista3;
import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
			double salario, minimo, calculo;
		
		System.out.println("Entre com seu sal�rio");
			salario= in.nextDouble();
			minimo=1302;
			calculo=salario/1302;
		System.out.println("Voc� ganha "+calculo+" sal�rios m�nimos.");
		
		if(calculo>=1) {
			System.out.println("Voc� ganha um sal�rio adequado");
		}else {
			System.out.println("Voc� ganha um sal�rio inadequado");
		}
	}
}
