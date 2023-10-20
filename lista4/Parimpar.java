package lista3;
import java.util.Scanner;
public class Parimpar {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
			int numero, calculo;
			System.out.println("Insira um número de zero a seis");
				numero= in.nextInt();
				calculo= numero%2;
			System.out.print("Você tem um número ");
			
			if (calculo==0) {
				System.out.print("número par");
			} else {
				System.out.print("número ímpar");
			}
	}
}
