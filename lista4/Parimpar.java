package lista3;
import java.util.Scanner;
public class Parimpar {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
			int numero, calculo;
			System.out.println("Insira um n�mero de zero a seis");
				numero= in.nextInt();
				calculo= numero%2;
			System.out.print("Voc� tem um n�mero ");
			
			if (calculo==0) {
				System.out.print("n�mero par");
			} else {
				System.out.print("n�mero �mpar");
			}
	}
}
