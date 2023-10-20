package lista;
import java.util.Scanner;
public class Cantina {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
			int x;
			
			System.out.println("Digite um número de 1 a 5");
			x= in.nextInt();
			
			switch (x) {
			case 1:
				System.out.println("Cachorro quente 8 R$");
			break;
			case 2:
				System.out.println("Cheeseburger 12 R$");
			break;
			case 3:
				System.out.println("X-salada 15 R$");
			break;
			case 4:
				System.out.println("Misto Quente 11 R$");
			break;
			case 5:
				System.out.println("Pão na Chapa 6 R$");
			break;
			default:
				System.out.println("Número Inválido");
			}
			
	}
}
