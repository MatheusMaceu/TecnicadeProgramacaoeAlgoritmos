package lista;
import java.util.Scanner;
public class Mesanodia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			int x;
			System.out.println("Escreva um n�mero do m�s");
			x=in.nextInt();
			
			switch(x) {
			
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Seu m�s possui 30 dias");
			break;
			
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Seu m�s possui 31 dias");
			break;
			
			case 2:
				System.out.println("Seu m�s possui 28 dias");
			break;
			
			default: 
				System.out.println("M�s inv�lido");
			}
		
	}
}
