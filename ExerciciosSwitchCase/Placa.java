package lista;
import java.util.Scanner;
public class Placa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			int x;
			System.out.println("Escreva o último número de sua placa");
			x=in.nextInt();
			switch(x) {
			case 1:
			case 2:
				System.out.println("Seu rodízio é Segunda");
			break;
			
			case 3:
			case 4:
				System.out.println("Seu rodízio é Terça");
			break;
			
			case 5:
			case 6:
				System.out.println("Seu rodízio é Quarta");
			break;
			
			case 7:
			case 8:
				System.out.println("Seu rodízio é Quinta");
			break;
			
			case 0:
			case 9:
				System.out.println("Seu rodízio é Sexta");
			break;
			
			default:
				System.out.println("Número Inválido");
			}
	}
}
