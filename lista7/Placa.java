package lista;
import java.util.Scanner;
public class Placa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			int x;
			System.out.println("Escreva o �ltimo n�mero de sua placa");
			x=in.nextInt();
			switch(x) {
			case 1:
			case 2:
				System.out.println("Seu rod�zio � Segunda");
			break;
			
			case 3:
			case 4:
				System.out.println("Seu rod�zio � Ter�a");
			break;
			
			case 5:
			case 6:
				System.out.println("Seu rod�zio � Quarta");
			break;
			
			case 7:
			case 8:
				System.out.println("Seu rod�zio � Quinta");
			break;
			
			case 0:
			case 9:
				System.out.println("Seu rod�zio � Sexta");
			break;
			
			default:
				System.out.println("N�mero Inv�lido");
			}
	}
}
